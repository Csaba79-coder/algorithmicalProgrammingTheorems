package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionTest {

    @Test
    void decide() {
        assertFalse(new Decision().decide(DataLoader.nums, DataLoader.numNotFound));
        assertTrue(new Decision().decide(DataLoader.nums, DataLoader.numForFound));
    }
}