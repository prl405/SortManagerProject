package com.sparta.sortmanager.controller;

import com.sparta.sortmanager.model.MyTimer;
import com.sparta.sortmanager.model.SortFactory;
import com.sparta.sortmanager.view.ArrayPrinter;
import com.sparta.sortmanager.view.UserInstructions;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.util.Scanner;

public class TheManager {


    public static void initializer() {
        String choice = null;
        UserInstructions.welcomeMessage();
        InputHandler theInputHandler = new InputHandler();
        Logger logger = Logger.getLogger("SortManager Log: ");
        PropertyConfigurator.configure("log4j.properties");
        logger.info("Program initialized");



        while (choice != "x") {
            int length;

            UserInstructions.sortChoiceMessage();

            Scanner scan = new Scanner(System.in);
            choice = theInputHandler.checkInputChoice(scan.next());
            logger.info("User Input = " + choice);


            if (choice.equals("x")) {
                UserInstructions.programExitingMessage();
                break;
            }
            else {
                UserInstructions.lengthChoiceMessage();
                length = theInputHandler.checkInputLength(Integer.parseInt(scan.next()));
                logger.info("User Input = " + Integer.toString(length));
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
            logger.info("User Input = " + choice);
            if (choice.equals("x")) {
                UserInstructions.programExitingMessage();
                break;
            }
        }
    }

}
