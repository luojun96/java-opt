package org.jun.algorithms.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {

    @Test
    void decodeString() {
        DecodeString decodeString = new DecodeString();
        Assertions.assertEquals("aaabcbc", decodeString.decodeString01("3[a]2[bc]"));
        Assertions.assertEquals("accaccacc", decodeString.decodeString01("3[a2[c]]"));
        Assertions.assertEquals("aaaaaaaaaab", decodeString.decodeString01("10[a]b"));
    }
}