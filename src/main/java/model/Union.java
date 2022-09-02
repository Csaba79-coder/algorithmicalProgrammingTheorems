package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {

    public void createUnion(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();
        for (int k : array1) {
            result.add(k);
        }
        for (int k : array2) {
            int i = 0;
            while (i < array1.length && array1[i] != k) {
                i++;
            }
            if (i >= array1.length) {
                result.add(k);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }

    public void createUnionWithForI(int[] array1, int[] array2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            result.add(array1[i]);
        }
        for (int j = 0; j < array2.length; j++) {
            int i = 0;
            while (i < array1.length && array1[i] != array2[j]) {
                i++;
            }
            if (i >= array1.length) {
                result.add(array2[j]);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }
}
