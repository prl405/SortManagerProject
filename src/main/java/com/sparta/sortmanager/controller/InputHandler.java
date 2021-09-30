package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.view.UserInstructions;

import java.util.Scanner;


public class InputHandler {

    private String[] possibleOperationInputs = {"x", "q", "b", "m"};
//    private Scanner exceptionScan = new Scanner();

    public String checkInputChoice(String choice){
        boolean isAOperation = false;
        for (String i : possibleOperationInputs) {
            if (i.equals(choice)) {
                isAOperation = true;
            }
        }
        try {
            if(!isAOperation){
                throw new IllegalArgumentException("Input is not recognisable.");
            }
        }
        catch (IllegalArgumentException ia){
            ia.getMessage();
            System.out.println("Input is not recognisable. Enter a character from the selection.");
        }
        return choice;
    }

    public int checkInputLength(int arrayLength){
        try{
            if (arrayLength <= 0){
                throw new IllegalArgumentException("Invalid array length.");
            }
        }
        catch (IllegalArgumentException ia){
            ia.getMessage();
            System.out.println("Invalid array length. Enter a value greater than 1.");
        }
        return arrayLength;
    }
}
