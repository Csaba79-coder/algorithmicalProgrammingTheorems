package bootstrap;

import model.Count;
import model.Decision;
import model.Sum;

public class DataLoader {

    public static int[] nums = new int[]{1, 2, 3};
    public static int numForFound = 2;
    public static int numNotFound = 16;


    public void runAppWithTestData() {
        int sum = new Sum().sum(nums);
        System.out.println("Sum is: " + sum);

        int counter = new Count().count(nums);
        System.out.println("Counter is: " + counter);

        boolean found = new Decision().decide(nums, numForFound);
        boolean notFound = new Decision().decide(nums, numNotFound);
        System.out.println("Found: " + found);
        System.out.println("Found: " + notFound + " --> not found!");
    }
}
