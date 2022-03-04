package org.jun.algorithms.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDistTest {

    @Test
    void minDistDP() {
        int[][] matrix = new int[][]{{1,3,5,9}, {2,1,3,4}, {5,2,6,7}, {6,8,4,3}};
        MinDist minDist = new MinDist();
        int minD = minDist.minDistDP(matrix, 4);
        Assertions.assertEquals(19, minD);
    }
}