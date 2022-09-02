package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import static org.junit.jupiter.api.Assertions.*;

class SearchingTest {

    @Test
    void search() {
        assertTrue(new Searching().search(DataLoader.nums, DataLoader.numForFound));
        assertFalse(new Searching().search(DataLoader.nums, DataLoader.numNotFound));
    }
}