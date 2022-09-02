package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedBy {

    public void sortedBy(int[] array, int num) {
        List<Integer> lessThanFive = new ArrayList<>();
        List<Integer> moreThanFive = new ArrayList<>();

        for (int j : array) {
            if (j < num) {
                lessThanFive.add(j);
            } else {
                moreThanFive.add(j);
            }
        }
        System.out.println(Arrays.toString(lessThanFive.toArray()));
        System.out.println(Arrays.toString(moreThanFive.toArray()));
    }
}
