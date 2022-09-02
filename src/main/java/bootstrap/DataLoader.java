package bootstrap;

import model.Sum;

public class DataLoader {

    public static int[] numsToSum = new int[]{1, 2, 3};

    public void runAppWithTestData() {
        int sum = new Sum().sum(numsToSum);
        System.out.println("Sum is: " + sum);
    }
}
