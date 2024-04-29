package com.realtech.AptechBank.repository;
import com.realtech.AptechBank.dto.AccountInfo;
import com.realtech.AptechBank.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
    boolean existsByEmail(String email);
    boolean existsByAccountNumber(String accountNumber);
    UserInfo findByAccountNumber(String accountNumber);
}