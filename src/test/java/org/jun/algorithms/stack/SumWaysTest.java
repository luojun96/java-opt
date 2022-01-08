package org.jun.algorithms.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumWaysTest {
    private SumWays sumWays;

    @BeforeEach
    void setUp() {
        sumWays = new SumWays();
    }

    @AfterEach
    void tearDown() {
        sumWays = null;
    }

    @Test
    void findTargetSumWays() {
        Assertions.assertEquals(5, sumWays.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }
}