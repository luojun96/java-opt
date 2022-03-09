package org.jun.algorithms.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    void merge() {
        int[] a = new int[]{1,3,5,7,10};
        int[] b = new int[]{2,4,8,9};
        int[] res = MergeSortedArray.merge(a,b);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,5,7,8,9,10}, res);
    }
}