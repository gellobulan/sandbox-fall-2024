package com.sandbox.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortingUtilityTest {

    @Test
    void testSelectionSort() {
        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.selectionSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testInsertionSort() {
        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.insertionSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testBubbleSort() {
        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.bubbleSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testQuickSort() {
        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.quickSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testMergeSort() {
        Integer[] arr = {5, 3, 1, 2, 4};
        SortingUtility.mergeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testEmptyArray() {
        Integer[] arr = {};
        SortingUtility.selectionSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    void testSingleElementArray() {
        Integer[] arr = {1};
        SortingUtility.bubbleSort(arr);
        assertArrayEquals(new Integer[]{1}, arr);
    }

    @Test
    void testAlreadySortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.insertionSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testReverseSortedArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.quickSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    void testArrayWithDuplicates() {
        Integer[] arr = {3, 5, 3, 2, 4, 5, 1};
        SortingUtility.mergeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 3, 4, 5, 5}, arr);
    }
}