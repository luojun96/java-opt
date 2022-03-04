package org.jun.algorithms.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueensTest {

    @Test
    void calNQueens() {
        Queens queens = new Queens(8);
        queens.calNQueens(0);
    }
}