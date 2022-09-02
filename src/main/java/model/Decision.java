package model;

public class Decision {

    public boolean decide(int[] array, int numForFound) {
        int i = 0;
        while (i < array.length && array[i] != numForFound) {
            i++;
        }
        /*if (i < array.length) {
            return true;
        } else {
            return false;
        }*/
        return i < array.length;
    }
}
