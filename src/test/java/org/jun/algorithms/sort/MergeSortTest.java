package org.jun.algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        MergeSort mergeSort = new MergeSort();

        int[] a = new int[]{1, 5, 6, 2, 3, 4};
        mergeSort.sort(a, 6);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, a);
    }
}