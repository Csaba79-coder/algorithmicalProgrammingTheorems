package model;

public class Searching {

    public boolean search(int[] array, int number) {
        int i = 0;
        while (i < array.length && array[i] != number) {
            i++;
        }
        return i < array.length;
    }
}
