package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTest {

    @Test
    void select() {
        assertEquals(-1, new Selection().select(DataLoader.nums, DataLoader.numNotFound));
        assertEquals(2, new Selection().select(DataLoader.nums, DataLoader.numForFound));
    }
}