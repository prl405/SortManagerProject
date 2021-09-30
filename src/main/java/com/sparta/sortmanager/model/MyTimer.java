package com.sparta.sortmanager.model;

public class MyTimer {
    private long startTime;
    public void startTimer(){
        this.startTime = System.nanoTime();
    }

    public long endTimer(){
        long runTime = System.nanoTime() - startTime;
        return runTime;
    }
}
