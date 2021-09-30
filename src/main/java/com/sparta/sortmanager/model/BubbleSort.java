package com.sparta.sortmanager.model;


import com.sparta.sortmanager.controller.Sortable;

public class BubbleSort implements Sortable {

    private int[] bubble(int[] arry) {
        int temp;
        for (int j = 0; j < arry.length - 1; j++) {
            for (int i = 0; i < arry.length - j - 1; i++) {
                if (arry[i] > arry[i + 1]) {
                    temp = arry[i + 1];
                    arry[i + 1] = arry[i];
                    arry[i] = temp;
                }
            }
        }
        return arry;
    }


    @Override
    public int[] runSort(int[] arry) {
        return bubble(arry);
    }


}
