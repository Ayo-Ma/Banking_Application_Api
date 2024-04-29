package com.realtech.AptechBank.configuration;

import com.realtech.AptechBank.entity.UserData;
import com.realtech.AptechBank.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDataDetailService implements UserDetailsService {

    @Autowired
    UserDataRepository userDataRepository;





    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserData> user = Optional.ofNullable(userDataRepository.findByName(username));

        return user.map(UserDataUserDetails::new).
                orElseThrow(()-> new UsernameNotFoundException("username does not exist"+username));
    }
    }

