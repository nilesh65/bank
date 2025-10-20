package com.bank.bank.transaction.services;

import com.bank.bank.res.Response;
import com.bank.bank.transaction.dtos.TransactionDTO;
import com.bank.bank.transaction.dtos.TransactionRequest;

import java.util.List;

public interface TransactionService {
    Response<?>createTransaction(TransactionRequest transactionRequest);
    Response<List<TransactionDTO>> getTransactionsForMyAccount(String accountNumber, int page, int size);
}
