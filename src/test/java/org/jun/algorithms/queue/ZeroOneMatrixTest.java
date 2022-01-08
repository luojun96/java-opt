package org.jun.algorithms.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroOneMatrixTest {

    @Test
    void updateMatrix() {
        ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();
        int[][] mat = new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        int[][] exp = new int[][]{{0,0,0},{0,1,0},{1,2,1}};

        Assertions.assertArrayEquals(exp, zeroOneMatrix.updateMatrix(mat));
    }

    @Test
    void updateMatrix_1() {
        ZeroOneMatrix zeroOneMatrix = new ZeroOneMatrix();
        int[][] mat = new int[][]{{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};
        int[][] exp = new int[][]{{0,0,0},{0,1,0},{1,2,1}};

        Assertions.assertArrayEquals(exp, zeroOneMatrix.updateMatrix(mat));
    }
}