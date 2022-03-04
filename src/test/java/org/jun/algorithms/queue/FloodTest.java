package org.jun.algorithms.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodTest {

    @Test
    void floodFill() {
        Flood flood = new Flood();
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int[][] result = new int[][]{{2,2,2},{2,2,0},{2,0,1}};

        int[][] actRes = flood.floodFill(image, 1, 1, 2);
        Assertions.assertArrayEquals(result, actRes);
    }

    @Test
    void floodFillDfs() {
        Flood flood = new Flood();
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int[][] result = new int[][]{{2,2,2},{2,2,0},{2,0,1}};

        int[][] actRes = flood.floodFillDfs(image, 1, 1, 2);
        Assertions.assertArrayEquals(result, actRes);
    }

    @Test
    void floodFill_1() {
        Flood flood = new Flood();
        int[][] image = new int[][]{{0,0,0},{0,1,1}};
        int[][] result = new int[][]{{0,0,0},{0,1,1}};

        int[][] actRes = flood.floodFill(image, 1, 1, 1);
        Assertions.assertArrayEquals(result, actRes);
    }

    @Test
    void floodFillDfs_1() {
        Flood flood = new Flood();
        int[][] image = new int[][]{{0,0,0},{0,1,1}};
        int[][] result = new int[][]{{0,0,0},{0,1,1}};

        int[][] actRes = flood.floodFillDfs(image, 1, 1, 1);
        Assertions.assertArrayEquals(result, actRes);
    }
}