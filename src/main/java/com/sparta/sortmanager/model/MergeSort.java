package com.sparta.sortmanager.model;

import com.sparta.sortmanager.controller.Sortable;

import java.util.Arrays;

public class MergeSort implements Sortable {

    private int[] merge(int[] A) {
        int len = A.length;
        int[] Z;
        int[] X;
        int[] Y;

        int[] firstHalf = Arrays.copyOfRange(A, 0, len / 2);
        int[] secondHalf = Arrays.copyOfRange(A, len / 2, len);
        if (len == 1) {
            return A;
        } else {
            X = merge(firstHalf);
            Y = merge(secondHalf);
            Z = sort(X, Y, len);
        }
        return Z;
    }

    private int[] sort(int[] B, int[] C, int len) {

        int i = 0;
        int j = 0;
        int[] D = new int[len];

        for (int k = 0; k < len; k++) {
            if (i + 1 > B.length) {
                int s = k;
                for (int n : Arrays.copyOfRange(C, j, C.length)) {
                    D[s] = n;
                    s++;
                }
                break;
            }
            if (j + 1 > C.length) {
                int s = k;
                for (int n : Arrays.copyOfRange(B, i, B.length)) {
                    D[s] = n;
                    s++;
                }
                break;
            }
            if (B[i] < C[j]) {
                D[k] = B[i];
                i += 1;
            } else {
                D[k] = C[j];
                j += 1;
            }
        }
        return D;
    }
//
//    @Override
//    public Sorts getSort() {
//        return new MergeSort();
//    }

    @Override
    public int[] runSort(int[] arry) {
        return merge(arry);
    }

}
