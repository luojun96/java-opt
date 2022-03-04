package org.jun.algorithms.heap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void findKthLargest() {
        KthLargest kthLargest = new KthLargest();
        int result = kthLargest.findKthLargest(new int[]{3,2,1,5,6,4}, 2);
        Assertions.assertEquals(5, result);
    }
}