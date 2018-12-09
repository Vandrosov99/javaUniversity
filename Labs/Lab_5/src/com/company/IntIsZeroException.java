package com.company;

public class IntIsZeroException extends Exception{
    public IntIsZeroException(String message)
    {
        super(message);
    }
    public String getMessage() {
        return "Cant be zero 0";
    }
}