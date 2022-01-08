package org.jun.algorithms.queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IslandsBFSTest {
    private IslandsBFS islandsBFS;

    @BeforeEach
    void setUp() {
        islandsBFS = new IslandsBFS();
    }

    @AfterEach
    void tearDown() {
        islandsBFS = null;
    }

    @Test
    void numIslands() {
        char[][] grid = new char[][]{{'1', '1', '0', '0', '1'},
                                     {'1', '0', '1', '0', '0'},
                                     {'1', '1', '0', '1', '1'},
                                     {'1', '0', '1', '0', '1'}};
        Assertions.assertEquals(5, islandsBFS.numIslands(grid));
    }
}