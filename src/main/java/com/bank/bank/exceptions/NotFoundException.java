package com.bank.bank.exceptions;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String error){
        super(error);
    }
}
