package com.bank.bank.exceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String error){
        super(error);
    }
}
