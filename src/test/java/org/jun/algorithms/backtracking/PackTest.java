package org.jun.algorithms.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackTest {

    @Test
    void f() {
        Pack pack = new Pack();
        pack.f(0, 0, new int[]{2, 2, 4, 6, 3}, 5, 9);
        Assertions.assertEquals(9, pack.maxW);
    }
}