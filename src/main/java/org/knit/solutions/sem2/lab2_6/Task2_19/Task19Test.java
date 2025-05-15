package org.knit.solutions.sem2.lab2_6.Task2_19;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task19Test {
    Solution19 solution = new Solution19();

    @Test
    public void testMerge_NormalCase(){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
    }

    @Test
    void testMerge_EmptyNums1() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        solution.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testMerge_EmptyNums2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testMerge_All() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        solution.merge(nums1, 0, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    void testMerge_DuplicatesAndNegatives() {
        int[] nums1 = {-3, -1, 0, 0, 0, 0};
        int[] nums2 = {-2, -1, 2};
        solution.merge(nums1, 2, nums2, 3);
        assertArrayEquals(new int[]{-3, -2, -1, -1, 0, 2}, nums1);
    }

    @Test
    void testMerge_Performance() {
        int size = 100_000;
        int[] nums1 = new int[size * 2];
        int[] nums2 = new int[size];

        for (int i = 0; i < size; i++) {
            nums1[i] = i;
            nums2[i] = i;
        }

        long start = System.nanoTime();
        solution.merge(nums1, size, nums2, size);
        long end = System.nanoTime();

        assertEquals(2 * size, nums1.length);
        assertTrue(end - start < 100_000_000, "Слияние заняло слишком много времени");

        for (int i = 0; i < 2 * size - 1; i++) {
            assertTrue(nums1[i] <= nums1[i + 1]);
        }
    }
}
