package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {
        int expected = 6;
        assertEquals(expected, new Sum().sum(DataLoader.numsToSum));
    }
}