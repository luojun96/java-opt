package org.jun.algorithms.stack;

import org.jun.algorithms.stack.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    private MyQueue myQueue;
    @BeforeEach
    void setUp() {
        myQueue = new MyQueue();
    }

    @AfterEach
    void tearDown() {
        myQueue = null;
    }

    @Test
    public void customQueueWithStack(){
        myQueue.push(1);
        myQueue.push(2);

        int param_2 = myQueue.pop();
        myQueue.push(3);
        int param_3 = myQueue.peek();
        boolean param_4 = myQueue.empty();

        Assertions.assertEquals(1, param_2);
        Assertions.assertEquals(2, param_3);
        Assertions.assertEquals(false, param_4);
    }
}