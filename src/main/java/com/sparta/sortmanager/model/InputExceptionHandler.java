package com.sparta.sortmanager.model;

public class InputExceptionHandler {

    public int lengthExceptionHandler(int arrayLength){
        if (arrayLength <= 0){
            throw new IllegalArgumentException("Invalid array length. Enter a value greater than 1.");
        }
        else {return arrayLength;}
    }
}
