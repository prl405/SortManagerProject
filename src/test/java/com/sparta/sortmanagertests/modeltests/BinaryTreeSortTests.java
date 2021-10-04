package com.sparta.sortmanagertests.modeltests;

import com.sparta.sortmanager.controller.Sortable;
import com.sparta.sortmanager.model.BinaryTreeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BinaryTreeSortTests extends TestArrays {
    private Sortable testSort = new BinaryTreeSort();

    @Test
    public void givenTestArray1_ReturnSortedArray1(){
        assertArrayEquals(sortedTestArray1, testSort.runSort(testArray1));

    }

    @Test
    public void givenTestArray0_ReturnSortedArray0(){
        assertArrayEquals(sortedTestArray0, testSort.runSort(testArray0));
    }

    @Test
    public void givenTestArray2_ReturnSortedArray2(){
        assertArrayEquals(sortedTestArray2, testSort.runSort(testArray2));
    }

    @Test
    public void givenTestArray3_ReturnSortedArray3(){
        assertArrayEquals(sortedTestArray3, testSort.runSort(testArray3));
    }

    @Test
    public void givenTestArray5_ReturnSortedArray5(){
        assertArrayEquals(sortedTestArray5, testSort.runSort(testArray5));
    }

    @Test
    public void givenTestArray5b_ReturnSortedArray5b(){
        assertArrayEquals(sortedTestArray5b, testSort.runSort(testArray5b));
    }

    @Test
    public void givenTestArray10_ReturnSortedArray10(){
        assertArrayEquals(sortedTestArray10, testSort.runSort(testArray10));
    }

    @Test
    public void givenTestArray100_ReturnSortedArray100(){
        assertArrayEquals(sortedTestArray100, testSort.runSort(testArray100));
    }

    @Test
    public void givenTestArray1000_ReturnSortedArray1000(){
        assertArrayEquals(sortedTestArray1000, testSort.runSort(testArray1000));
    }

    @Test
    public void givenTestArray1000_ReturnSortedArray1000b(){
        assertArrayEquals(sortedTestArray1000b, testSort.runSort(testArray1000b));
    }

}
