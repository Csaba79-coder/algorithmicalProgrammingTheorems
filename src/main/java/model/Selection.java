package model;

public class Selection {

    public int select(int[] array, int number) {
        int element;
        if (array == null) {
            return -1;
        }
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                element = i + 1;
                return element;
            } else {
                i++;
            }
        }
        return -1;
    }
}
