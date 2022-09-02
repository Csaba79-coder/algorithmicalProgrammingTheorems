package bootstrap;

import model.Count;
import model.Sum;

public class DataLoader {

    public static int[] numsToSum = new int[]{1, 2, 3};

    public void runAppWithTestData() {
        int sum = new Sum().sum(numsToSum);
        System.out.println("Sum is: " + sum);

        int counter = new Count().count(numsToSum);
        System.out.println("Counter is: " + counter);
    }
}
