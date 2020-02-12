package com.example.myOrder.exceptions;

public class AlreadyExistsException extends RuntimeException{

    public  AlreadyExistsException(String message){
        super(message);
    }
}
