package org.jun.algorithms.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    private MinStack minStack;
    @BeforeEach
    void setUp() {
        minStack = new MinStack();
    }

    @AfterEach
    void tearDown() {
        minStack = null;
    }

    @Test
    void getMin() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        Assertions.assertEquals(-3, minStack.getMin());

        minStack.pop();
        Assertions.assertEquals(-2, minStack.getMin());
    }

    @Test
    void getMin01(){
        // ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
        // [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.pop();
        minStack.pop();
        minStack.push(2147483647);
        minStack.push(-2147483648);
        Assertions.assertEquals(-2147483648, minStack.getMin());

    }

    @Test
    void subtract(){
        int result = (-2147483648) - 2147483647;
        Assertions.assertEquals((result < 0), true);
    }
}