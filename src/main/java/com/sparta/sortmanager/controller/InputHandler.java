package com.sparta.sortmanager.controller;


public class InputHandler {

    private String[] possibleOperationInputs = {"x", "q", "b", "m"};
//    private Scanner exceptionScan = new Scanner();

//    public String getUserInput(String int){
////        Scanner scan = new Scanner();
//
//    }

    public boolean checkInputChoice(String choice){
        boolean isNotAnOperation = true;
        for (String i : possibleOperationInputs) {
            if (i.equals(choice)) {
                isNotAnOperation = false;
            }
        }
        try {
            if(isNotAnOperation){
                throw new IllegalArgumentException("Input is not recognisable.");
            }
        }
        catch (IllegalArgumentException ia){
//            ia.getMessage();
            System.out.println("Input is not recognisable. Please enter a character from the selection.");
        }
        finally {
            return isNotAnOperation;
        }
    }

    public boolean checkInputLength(int arrayLength){
        boolean isNotValidLength = false;
        try{
            if (arrayLength <= 0){
                throw new IllegalArgumentException("Invalid array length.");
            }
        }
        catch (IllegalArgumentException ia){
            isNotValidLength = true;
            ia.getMessage();
            System.out.println("Invalid array length. Please enter a value greater than 1.");
        }
        finally {
            return isNotValidLength;
        }
    }
}
