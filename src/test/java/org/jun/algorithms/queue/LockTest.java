package org.jun.algorithms.queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockTest {
    private Lock lock;
    @BeforeEach
    void setUp() {
        lock = new Lock();
    }

    @AfterEach
    void tearDown() {
        lock = null;
    }

    @Test
    void openLock() {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        Assertions.assertEquals(6, lock.openLock(deadends, target));
    }

    @Test
    void substring(){
        String target = "0701";
        char ch = target.charAt(1);
        String sub1 = target.substring(0, 0);
        int subch = ch - '0';
        int sub2 = (ch == '9' ? 0 : ch - '0' + 1);
        String AddStr = target.substring(0, 1) + (ch == '9' ? 0 : ch - '0' + 1) + target.substring(2);
        Assertions.assertEquals("0001", AddStr);
    }
}