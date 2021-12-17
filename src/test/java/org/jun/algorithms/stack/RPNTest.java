package org.jun.algorithms.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RPNTest {
    private RPN rpn;
    @BeforeEach
    void setUp() {
        rpn = new RPN();
    }

    @AfterEach
    void tearDown() {
        rpn = null;
    }

    @Test
    void evalRPN() {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
//        rpn.evalRPN(tokens);
        Assertions.assertEquals(22, rpn.evalRPN(tokens));
    }
}