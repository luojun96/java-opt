package org.jun.algorithms.queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandsDFSTest {
    private IslandsDFS islandsDFS;
    @BeforeEach
    void setUp() {
        islandsDFS = new IslandsDFS();
    }

    @AfterEach
    void tearDown() {
        islandsDFS = null;
    }

    @Test
    void numIslands() {
        char[][] grid = new char[][]{{'1', '1', '0', '0', '1'},
                {'1', '0', '1', '0', '0'},
                {'1', '1', '0', '1', '1'},
                {'1', '0', '1', '0', '1'}};
        Assertions.assertEquals(5, islandsDFS.numIslands(grid));
    }
}