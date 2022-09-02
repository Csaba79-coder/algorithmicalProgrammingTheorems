package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.DataLine;

import static org.junit.jupiter.api.Assertions.*;

class CountTest {

    @Test
    void count() {
        int expected = 1;
        assertEquals(expected, new Count().count(DataLoader.numsToSum));
    }
}