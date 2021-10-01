package com.sparta.sortmanager.view;

public class UserPrompts {
    public static void welcomeMessage(){
        System.out.println("This is a program that sorts a random array of integers of your chosen length.");
    }

    public static void sortChoiceMessage(){
        System.out.println("Which algorithm would you like to use?");
        System.out.println("Bubble sort : b");
        System.out.println("Merge sort : m");
        System.out.println("Quick sort: q");
        System.out.println("To exit: x");
    }

    public static void programExitingMessage(){
        System.out.println("Exiting program...");
    }

    public static void lengthChoiceMessage(){
        System.out.println("Please enter an integer length for the array.");
    }

    public static void returnToStartMessage(){
        System.out.println("Would you like to sort another array?");
        System.out.println("Yes: y");
        System.out.println("Exit: x");
    }

    public static void displaySortRuntime(long runtime){
        System.out.println("Algorithm runtime: " + Long.toString(runtime));
    }
}
