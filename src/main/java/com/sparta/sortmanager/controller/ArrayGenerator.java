package com.sparta.sortmanager.controller;

import java.util.Random;

public class ArrayGenerator {

    public static int[] generateRandomArray(int length){
        int[] arry = new Random().ints(0,100).limit(length).toArray();
        return arry;
    }

}
