package com.bank.bank.account.services;

import com.bank.bank.account.dtos.AccountDTO;
import com.bank.bank.account.entity.Account;
import com.bank.bank.auth_users.entity.User;
import com.bank.bank.enums.AccountType;
import com.bank.bank.res.Response;

import java.util.List;

public interface AccountService {
    Account createAccount(AccountType accountType, User user);

    Response<List<AccountDTO>> getMyAccounts();

    Response<?> closeAccount(String accountNumber);
}
