package org.jun.algorithms.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort() {
        int[] a =  new int[]{4, 5, 6, 3, 2, 1};
        SelectionSort.sort(a, a.length);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, a);
    }
}