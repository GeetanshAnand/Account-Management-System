package com.geetansh.BankingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geetansh.BankingApplication.entity.Account;


public interface AccountRepository extends JpaRepository<Account,Long> {

}
