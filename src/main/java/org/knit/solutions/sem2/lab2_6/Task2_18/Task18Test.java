package org.knit.solutions.sem2.lab2_6.Task2_18;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task18Test {
    Solution18 dz = new Solution18();

    private void assertArrayEqualsCustom(int[] expected, int[] actual){
        assertArrayEquals(expected, actual, "Массивы не совпадают");
    }

    @Test
    public void testExample1(){
        int[] arr = {1, 0,2, 3, 0, 4, 5, 0};
        dz.duplicateZeros(arr);
        assertArrayEqualsCustom(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    public void testExample2(){
        int[] arr = {1, 2, 3};
        dz.duplicateZeros(arr);
        assertArrayEqualsCustom(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testEmptyArray(){
        int[] arr = {};
        dz.duplicateZeros(arr);
        assertArrayEqualsCustom(new int[]{}, arr);
    }

    @Test
    public void testAllZeros(){
        int[] arr = {0, 0 ,0, 0};
        dz.duplicateZeros(arr);
        assertArrayEqualsCustom(new int[]{0,0,0,0}, arr);
    }

    @Test
    public void testZeroEnd(){
        int[] arr = {1, 2, 3, 0};
        dz.duplicateZeros(arr);
        assertArrayEqualsCustom(new int[]{1, 2, 3, 0}, arr);
    }

    @Test
    public void testLargeArray(){
        int size = 10000;
        int [] arr = new int[size];
        for(int i = 0; i < size; i++) arr[i] = i % 2 == 0 ? 0 : 1;

        long start = System.currentTimeMillis();
        dz.duplicateZeros(arr);
        long duration = System.currentTimeMillis() - start;

        System.out.println("ВРемя выполнения (ms): " + duration);
        assertTrue(duration < 1000, "СЛишком долго работает");
    }
}
