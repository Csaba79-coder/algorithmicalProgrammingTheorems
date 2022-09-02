package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public void section(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();
        for (int k : array1) {
            int j = 0;
            while (j < array2.length && array2[j] != k) {
                j++;
            }
            if (j < array2.length) {
                result.add(k);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }
}
