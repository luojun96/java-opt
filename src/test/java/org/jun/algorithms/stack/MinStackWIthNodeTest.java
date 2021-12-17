package org.jun.algorithms.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackWIthNodeTest {
    private MinStackWIthNode minStack;
    @BeforeEach
    void setUp() {
        minStack = new MinStackWIthNode();
    }

    @AfterEach
    void tearDown() {
        minStack = null;
    }

    @Test
    void push() {
    }

    @Test
    void pop() {
    }

    @Test
    void top() {
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
}