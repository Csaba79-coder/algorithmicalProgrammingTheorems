package model;

import java.util.ArrayList;
import java.util.List;

public class Assortment {

    public Object[] assort(int[] array, int number) {
        List<Integer> nums = new ArrayList<>();
        for (int j : array) {
            if (j > number) {
                nums.add(j);
            }
        }
        return nums.toArray();
    }
}
