package org.jun.algorithms.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesTest {
    private Temperatures temperatures;

    @BeforeEach
    void setUp() {
        temperatures = new Temperatures();
    }

    @AfterEach
    void tearDown() {
        temperatures = null;
    }

    @Test
    void dailyTemperatures() {
        int[] temperaturesInput = new int[]{3,74,75,71,69,72,76,73};
        int[] expectedDailyTemperatures = new int[]{1,1,4,2,1,1,0,0};

        Assertions.assertArrayEquals(expectedDailyTemperatures, temperatures.dailyTemperatures(temperaturesInput));
    }

    @Test
    void dailyTemperatures01(){
        int[] temperaturesInput = new int[]{89,62,70,58,47,47,46,76,100,70};
        int[] expectedDailyTemperatures = new int[]{8,1,5,4,3,2,1,1,0,0};

        Assertions.assertArrayEquals(expectedDailyTemperatures, temperatures.dailyTemperatures(temperaturesInput));
    }
}