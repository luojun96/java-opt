package org.jun.algorithms.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {
    private DecodeString decodeString;
    @BeforeEach
    void setUp() {
        decodeString = new DecodeString();
    }

    @AfterEach
    void tearDown() {
        decodeString = null;
    }

    @Test
    void isValid() {
        Assertions.assertEquals(true, decodeString.isValid("{[()]}"));
        Assertions.assertEquals(true, decodeString.isValid("{}[]()"));
        Assertions.assertEquals(false, decodeString.isValid("{}[]("));
    }

    @Test
    void isValid01(){
        Assertions.assertEquals(false, decodeString.isValid("(("));
    }
}