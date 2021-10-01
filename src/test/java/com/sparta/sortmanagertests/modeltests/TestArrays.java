package com.sparta.sortmanagertests.modeltests;

public class TestArrays {

    protected int[] testArray0 = {};
    protected int[] testArray1 = {1};
    protected int[] testArray2 = {1,2};
    protected int[] testArray3 = {1,1,1,3,3,3,1,3};
    protected int[] testArray5 = {1,2,3,4,5};
    protected int[] testArray5b = {5,4,3,2,1};
    protected int[] testArray10 = {9,8,7,6,5,4,3,2,1,0};
    protected int[] testArray100 = new int[100];
    protected int[] testArray1000 = new int[1000];
    protected int[] testArray1000b = {0, 77, 71, 94, 41, 63, 92, 59, 12, 27, 46, 60, 50, 23, 32, 11, 79, 70, 68, 57, 0, 99, 83, 31, 28, 46, 91, 86, 63, 55, 45, 37, 25, 36, 72, 97, 74, 88, 48, 17, 18, 95, 48, 76, 97, 81, 9, 24, 48, 51, 95, 40, 54, 24, 54, 73, 3, 21, 63, 27, 10, 5, 11, 40, 4, 60, 73, 15, 57, 91, 96, 64, 87, 84, 99, 79, 65, 59, 44, 58, 61, 22, 64, 55, 91, 70, 32, 43, 46, 56, 55, 13, 74, 52, 24, 68, 60, 92, 19, 96, 49, 45, 57, 56, 45, 98, 3, 97, 53, 29, 25, 67, 41, 36, 19, 47, 3, 21, 81, 59, 5, 39, 9, 65, 30, 29, 10, 27, 48, 45, 29, 56, 19, 10, 55, 6, 6, 62, 53, 28, 50, 39, 39, 58, 11, 0, 37, 7, 8, 17, 57, 95, 64, 77, 3, 43, 11, 97, 47, 14, 90, 69, 55, 86, 98, 69, 13, 29, 85, 79, 40, 18, 75, 81, 24, 83, 81, 63, 81, 48, 31, 46, 92, 42, 87, 90, 0, 46, 80, 54, 75, 94, 13, 35, 74, 55, 15, 60, 17, 8, 49, 85, 16, 59, 34, 42, 54, 62, 62, 44, 3, 86, 70, 63, 21, 48, 34, 23, 73, 55, 61, 13, 4, 10, 13, 36, 17, 70, 21, 2, 89, 25, 24, 21, 78, 89, 23, 12, 2, 76, 98, 39, 99, 40, 29, 82, 85, 77, 90, 23, 76, 86, 68, 34, 36, 74, 61, 86, 0, 29, 45, 98, 30, 48, 60, 30, 33, 85, 95, 33, 16, 31, 84, 73, 22, 83, 67, 93, 16, 57, 97, 94, 39, 6, 46, 96, 53, 2, 71, 57, 83, 21, 47, 86, 47, 43, 23, 53, 77, 34, 34, 30, 83, 45, 34, 77, 95, 75, 37, 58, 97, 96, 48, 49, 61, 28, 58, 53, 65, 66, 34, 16, 31, 89, 46, 24, 78, 47, 36, 77, 54, 30, 59, 15, 13, 1, 79, 7, 27, 27, 74, 83, 66, 27, 47, 3, 59, 68, 37, 24, 24, 47, 46, 71, 7, 79, 30, 9, 45, 65, 47, 86, 29, 66, 34, 52, 44, 23, 87, 44, 32, 16, 43, 9, 37, 37, 75, 5, 48, 13, 94, 8, 0, 56, 11, 51, 11, 44, 33, 57, 33, 8, 11, 77, 33, 38, 52, 49, 77, 35, 98, 36, 8, 18, 67, 48, 67, 9, 50, 10, 48, 80, 7, 95, 67, 8, 29, 43, 8, 87, 44, 80, 30, 76, 22, 14, 42, 41, 45, 62, 95, 18, 88, 18, 6, 48, 23, 64, 52, 21, 37, 7, 91, 8, 0, 87, 2, 9, 24, 67, 48, 85, 13, 46, 84, 33, 79, 43, 64, 44, 32, 79, 80, 10, 93, 66, 19, 19, 15, 17, 31, 33, 29, 14, 42, 15, 58, 73, 1, 38, 44, 64, 26, 66, 44, 47, 82, 11, 98, 70, 4, 51, 22, 16, 94, 69, 13, 52, 5, 50, 22, 91, 13, 79, 92, 90, 72, 58, 36, 81, 47, 64, 45, 13, 31, 74, 56, 67, 5, 71, 3, 31, 5, 69, 6, 28, 42, 2, 80, 65, 90, 59, 72, 94, 50, 84, 63, 17, 57, 48, 55, 47, 62, 41, 27, 67, 89, 64, 54, 93, 89, 87, 22, 17, 99, 47, 33, 13, 52, 73, 46, 73, 38, 84, 70, 93, 6, 45, 99, 91, 17, 87, 63, 39, 44, 91, 70, 65, 98, 49, 17, 51, 62, 81, 3, 12, 99, 4, 90, 1, 47, 34, 55, 83, 7, 5, 40, 54, 9, 57, 10, 96, 29, 8, 39, 45, 90, 24, 38, 12, 97, 60, 90, 92, 4, 40, 34, 73, 40, 69, 18, 90, 13, 65, 59, 63, 99, 43, 41, 87, 26, 48, 82, 65, 88, 19, 19, 5, 20, 26, 83, 39, 79, 78, 40, 63, 58, 88, 95, 79, 62, 82, 16, 98, 28, 2, 35, 25, 49, 42, 45, 37, 83, 10, 62, 42, 43, 15, 9, 71, 61, 52, 18, 74, 54, 95, 24, 13, 97, 25, 10, 19, 58, 35, 1, 14, 37, 66, 97, 74, 86, 62, 77, 81, 98, 47, 65, 85, 72, 61, 70, 94, 59, 42, 77, 58, 89, 54, 14, 2, 9, 79, 63, 88, 34, 43, 96, 2, 15, 36, 98, 98, 88, 66, 69, 17, 63, 44, 85, 0, 41, 96, 36, 52, 80, 17, 61, 2, 40, 48, 89, 66, 45, 31, 34, 2, 16, 95, 70, 42, 8, 80, 38, 48, 41, 47, 44, 66, 52, 87, 52, 31, 97, 49, 63, 7, 1, 63, 22, 98, 92, 17, 33, 65, 67, 87, 60, 94, 44, 26, 15, 14, 38, 54, 2, 52, 57, 88, 91, 20, 95, 78, 84, 33, 93, 24, 10, 41, 93, 10, 61, 83, 64, 88, 55, 75, 57, 45, 75, 27, 76, 45, 14, 94, 46, 82, 56, 3, 30, 6, 25, 79, 65, 64, 52, 34, 51, 4, 94, 28, 22, 17, 28, 37, 28, 26, 94, 8, 20, 96, 8, 62, 82, 12, 15, 13, 0, 52, 41, 52, 74, 53, 63, 66, 66, 5, 44, 47, 65, 35, 26, 89, 18, 72, 96, 34, 49, 75, 24, 40, 28, 60, 15, 78, 81, 18, 75, 45, 80, 37, 50, 71, 76, 9, 36, 11, 70, 53, 75, 19, 71, 54, 35, 24, 98, 55, 82, 53, 89, 2, 78, 91, 48, 74, 85, 91, 90, 37, 18, 16, 1, 28, 49, 57, 40, 21, 65, 69, 24, 41, 59, 71, 71, 52, 8, 81, 18, 46, 12, 23, 26, 40, 74, 48, 98, 8, 12, 34, 96, 58, 67, 20, 88, 53, 76, 69, 51, 30, 14, 99, 6, 51, 23, 30, 31, 59, 30, 8, 9, 50, 32, 66, 84, 29, 64, 17, 40, 36, 29, 38, 55, 60, 35, 15, 1, 52, 33, 56, 76, 63, 58, 91, 90, 13, 27, 4, 18, 28, 25, 76, 60, 89, 80, 97, 89, 60, 75, 8, 31, 77};

    protected int[] sortedTestArray0 = {};
    protected int[] sortedTestArray1 = {1};
    protected int[] sortedTestArray2 = {1,2};
    protected int[] sortedTestArray3 = {1, 1, 1, 1, 3, 3, 3, 3};
    protected int[] sortedTestArray5 = {1,2,3,4,5};
    protected int[] sortedTestArray5b = {1,2,3,4,5};
    protected int[] sortedTestArray10 = {0,1,2,3,4,5,6,7,8,9};
    protected int[] sortedTestArray100 = new int[100];
    protected int[] sortedTestArray1000 = new int[1000];
    protected int[] sortedTestArray1000b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25, 25, 25, 25, 25, 26, 26, 26, 26, 26, 26, 26, 27, 27, 27, 27, 27, 27, 27, 27, 27, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 28, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 29, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 31, 32, 32, 32, 32, 32, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 35, 35, 35, 35, 35, 35, 35, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 37, 38, 38, 38, 38, 38, 38, 38, 39, 39, 39, 39, 39, 39, 39, 39, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 42, 42, 42, 42, 42, 42, 42, 42, 42, 43, 43, 43, 43, 43, 43, 43, 43, 43, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 46, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 49, 49, 49, 49, 49, 49, 49, 49, 49, 50, 50, 50, 50, 50, 50, 50, 51, 51, 51, 51, 51, 51, 51, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 52, 53, 53, 53, 53, 53, 53, 53, 53, 53, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 55, 56, 56, 56, 56, 56, 56, 56, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 57, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 58, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 59, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 60, 61, 61, 61, 61, 61, 61, 61, 61, 62, 62, 62, 62, 62, 62, 62, 62, 62, 62, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 63, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 64, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 65, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 66, 67, 67, 67, 67, 67, 67, 67, 67, 67, 67, 68, 68, 68, 68, 69, 69, 69, 69, 69, 69, 69, 69, 70, 70, 70, 70, 70, 70, 70, 70, 70, 70, 71, 71, 71, 71, 71, 71, 71, 71, 71, 72, 72, 72, 72, 72, 73, 73, 73, 73, 73, 73, 73, 73, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 74, 75, 75, 75, 75, 75, 75, 75, 75, 75, 75, 76, 76, 76, 76, 76, 76, 76, 76, 76, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 77, 78, 78, 78, 78, 78, 78, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 79, 80, 80, 80, 80, 80, 80, 80, 80, 80, 81, 81, 81, 81, 81, 81, 81, 81, 81, 81, 82, 82, 82, 82, 82, 82, 82, 83, 83, 83, 83, 83, 83, 83, 83, 83, 83, 84, 84, 84, 84, 84, 84, 84, 85, 85, 85, 85, 85, 85, 85, 85, 86, 86, 86, 86, 86, 86, 86, 86, 87, 87, 87, 87, 87, 87, 87, 87, 87, 87, 88, 88, 88, 88, 88, 88, 88, 88, 88, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 89, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 91, 92, 92, 92, 92, 92, 92, 93, 93, 93, 93, 93, 93, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 94, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 95, 96, 96, 96, 96, 96, 96, 96, 96, 96, 96, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 97, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 98, 99, 99, 99, 99, 99, 99, 99, 99};


}