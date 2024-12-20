package com.learning.designpatterns.exception;

// This class UnsupportedTypeException has been created to handle the custom exception.

public class UnsupportedTypeException extends Exception{
    public UnsupportedTypeException(String exceptionMessage){
        super(exceptionMessage);
    }
}
