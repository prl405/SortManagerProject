package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.MyTimer;
import com.sparta.sortmanager.model.SortFactory;
import com.sparta.sortmanager.view.ArrayPrinter;
import com.sparta.sortmanager.view.UserPrompts;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.util.Scanner;

public class TheManager {


    public static void initializer() {
        String choice = null;

        UserPrompts.welcomeMessage();
        InputHandler theInputHandler = new InputHandler();
        Logger logger = Logger.getLogger("SortManager Log: ");
        PropertyConfigurator.configure("log4j.properties");
        logger.info("Program initialized");



        while (choice != "x") {
            boolean invalidChoice = true;
            Scanner scan = new Scanner(System.in);
            Integer length = null;
            Sortable theSort = null;

            boolean invalidLength = true;
            int[] arrayUnsorted;
            int[] arrayUnsorted2;
            int[] arraySorted;


            UserPrompts.sortChoiceMessage();
            while (invalidChoice){ // Exception Handling
                choice = scan.next();
                logger.info("User Input = " + choice);
                invalidChoice = theInputHandler.checkInputChoice(choice);
            }

            if (choice.equals("x")) {
                UserPrompts.programExitingMessage();
                logger.info("Program Terminated");
                break;
            }
            else {
                MyTimer sortTimer = new MyTimer();
                long runTime;

                UserPrompts.lengthChoiceMessage();
                while (invalidLength){ // Exception Handling
                    length = Integer.parseInt(scan.next());
                    logger.info("User Input = " + Integer.toString(length));
                    invalidLength = theInputHandler.checkInputLength(length);
                }

                arrayUnsorted = ArrayGenerator.generateRandomArray(length);
                arrayUnsorted2 = arrayUnsorted.clone();
                sortTimer.startTimer();
                theSort = SortFactory.getSortable(choice);
                runTime = sortTimer.endTimer();
                arraySorted = theSort.runSort(arrayUnsorted);
                UserPrompts.displayUnstoredToSorted(arrayUnsorted2, arraySorted);
                UserPrompts.displaySortRuntime(runTime);
            }

            UserPrompts.returnToStartMessage();
            choice = scan.next();
            logger.info("User Input = " + choice);
            if (choice.equals("x")) {
                UserPrompts.programExitingMessage();
                logger.info("Program Terminated");
                break;
            }
        }
    }

}
