package model;

import bootstrap.DataLoader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssortmentTest {

    @Test
    void assort() {
        Object[] nums = new Object[]{43};
        assertArrayEquals(nums, new Assortment().assort(DataLoader.numbers, DataLoader.numNotFound));
    }
}