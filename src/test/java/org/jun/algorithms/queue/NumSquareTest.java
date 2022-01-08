package org.jun.algorithms.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumSquareTest {

    @Test
    void numSquares() {
        NumSquare numSquare = new NumSquare();
        Assertions.assertEquals(2, numSquare.numSquaresWithDP(13));
    }
}