package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.MyTimer;
import com.sparta.sortmanager.model.SortFactory;
import com.sparta.sortmanager.view.ArrayPrinter;
import com.sparta.sortmanager.view.UserInstructions;

import java.util.Scanner;

public class TheManager {

    public static void intializer() {
        String choice = null;
        UserInstructions.welcomeMessage();
        InputHandler theInputHandler = new InputHandler();

        while (choice != "x") {
            int length;

            UserInstructions.sortChoiceMessage();

            Scanner scan = new Scanner(System.in);
            choice = theInputHandler.checkInputChoice(scan.next());


            if (choice.equals("x")) {
                UserInstructions.programExitingMessage();
                break;
            }
            else {
                UserInstructions.lengthChoiceMessage();
                length = theInputHandler.checkInputLength(Integer.parseInt(scan.next()));
                Sortable theSort = null;
                MyTimer sortTimer = new MyTimer();
                long runTime;

                int[] arrayUnsorted = ArrayGenerator.generateRandomArray(length);
                sortTimer.startTimer();
                theSort = SortFactory.getSortable(choice);
                runTime = sortTimer.endTimer();
                UserInstructions.displaySortRuntime(runTime);
                int[] arraySorted = theSort.runSort(arrayUnsorted);
                ArrayPrinter.print(arraySorted);
            }

            UserInstructions.returnToStartMessage();
            choice = scan.next();
            if (choice.equals("x")) {
                UserInstructions.programExitingMessage();
                break;
            }
        }
    }

}
