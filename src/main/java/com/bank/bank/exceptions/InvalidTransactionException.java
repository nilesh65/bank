package com.bank.bank.exceptions;

public class InvalidTransactionException extends RuntimeException{
    public InvalidTransactionException(String error){
        super(error);
    }
}
