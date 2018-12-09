package com.company;

public class IntIsMinusExeption extends Exception{
    public IntIsMinusExeption(String message)
    {
        super(message);
    }
    @Override
    public String getMessage() {
        return "Otricatelnoe chislo";
    }
}
