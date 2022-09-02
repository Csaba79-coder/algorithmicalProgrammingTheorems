package model;

public class Count {

    public int count(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j > 2) {
                counter++;
            }
        }
        return counter;
    }
}
