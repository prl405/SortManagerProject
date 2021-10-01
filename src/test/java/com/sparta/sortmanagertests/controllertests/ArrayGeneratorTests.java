package com.sparta.sortmanagertests.controllertests;

import com.sparta.sortmanager.controller.ArrayGenerator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayGeneratorTests {
    @Test
    public void given1_ReturnArrayWithLength1(){
        assertEquals(1, Array.getLength(ArrayGenerator.generateRandomArray(1)));
    }

    @Test
    public void given100_ReturnArrayWithLength100(){
        assertEquals(100, Array.getLength(ArrayGenerator.generateRandomArray(100)));
    }

//    @Test
//    public void givenASeed_ReturnTheCorrectArray(){
//        Random rand = new Random();
//        rand.setSeed(53);
//        assertEquals();
//    }
}
