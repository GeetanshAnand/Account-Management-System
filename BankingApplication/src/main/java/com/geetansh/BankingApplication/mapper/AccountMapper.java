package com.geetansh.BankingApplication.mapper;

import com.geetansh.BankingApplication.dto.AccountDto;
import com.geetansh.BankingApplication.entity.Account;

public class AccountMapper {
    
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance(),
            accountDto.getAmount()
        );

        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
            account.getId(),
            account.getAccountHolderName(),
            account.getBalance(),
            account.getAmount()
        );

        return accountDto;
    }
}
