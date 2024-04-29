package com.realtech.AptechBank.repository;

import com.realtech.AptechBank.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData,Integer> {
    UserData findByName(String username);

}
