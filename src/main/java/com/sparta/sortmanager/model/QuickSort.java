package com.sparta.sortmanager.model;

import com.sparta.sortmanager.controller.Sortable;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort implements Sortable {

    private void Quick(int[] A, int left, int right){
        if( right - left <= 0){return;}
        else {
            int pivot = ChoosePivotPosition(A, left, right);
            int part = Partition(A, left, right, pivot);

            Quick(A, left, part - 1); // Left of pivot partition
            Quick(A, part + 1, right); // Right of pivot partition
        }
        return;
    }

    private int Partition(int[] A, int left, int right, int pivotIndex){
        int p = A[pivotIndex]; // First element in A is pivot
        if (pivotIndex != left) {
            A[pivotIndex] = A[left];
            A[left] = p;
        }
        int i = left + 1;

        for (int j = left + 1; j < right + 1; j++){
            if (A[j] < p) {
                int tempElement1 = A[i];
                A[i] = A[j];
                A[j] = tempElement1;
                i += 1;
            }
        }

        int tempElement2 = A[i - 1];
        A[i - 1] = A[left];
        A[left] = tempElement2;
        return i - 1;
    }

    private int ChoosePivotPosition(int[] A, int left, int right){
        int first = A[left];
        int last = A[right];

        int mid = A[left + (right - left)/2];
        int midPosition = left + (right - left)/2;

        Integer[] medOfThree = {first, mid, last};
        int max = Collections.max(Arrays.asList(medOfThree));
        int min = Collections.min(Arrays.asList(medOfThree));
        int median = 0;

        for (int i: medOfThree){
            if(i != max && i != min){
                median = i;
            }
        }

        int pivotPosition;

        if (median == first) {
            pivotPosition = left;
        }
        else if (median == last) {
            pivotPosition = right;
        }
        else {
            pivotPosition = midPosition;
        }
        return pivotPosition;
    }

//    @Override
//    public Sorts getSort() {
//        return new QuickSort();
//    }

    @Override
    public int[] runSort(int[] arry) {
        Quick(arry, 0, arry.length - 1);
        return arry;
    }
}
