package com.lior.AdoptMe.exception;

public class AnimalNotFoundException extends RuntimeException{
    public AnimalNotFoundException(String s) {
        super(s);
    }
}
