package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAndMaxTest {

    @Test
    void findMin() {
        assertEquals(1, new MinAndMax().findMin(DataLoader.numbers));
    }

    @Test
    void findMax() {
        assertEquals(43, new MinAndMax().findMax(DataLoader.numbers));
    }
}