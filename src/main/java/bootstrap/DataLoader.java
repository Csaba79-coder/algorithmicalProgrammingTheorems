package bootstrap;

import model.*;

import java.util.Arrays;

public class DataLoader {

    public static int[] nums = new int[]{1, 2, 3};
    public static int numForFound = 2;
    public static int numNotFound = 16;
    public static int[] numbers = new int[]{1, 3, 5, 6, 43, 8};


    public void runAppWithTestData() {
        int sum = new Sum().sum(nums);
        System.out.println("Sum is: " + sum);

        int counter = new Count().count(nums);
        System.out.println("Counter is: " + counter);

        boolean found = new Decision().decide(nums, numForFound);
        boolean notFound = new Decision().decide(nums, numNotFound);
        System.out.println("Found: " + found);
        System.out.println("Found: " + notFound + " --> not found!");

        int element = new Selection().select(nums, numForFound);
        int notFoundElement = new Selection().select(nums, numNotFound);
        System.out.println("Element (if found): " + element);
        System.out.println("Element (if not found): " + notFoundElement);

        boolean founded = new Searching().search(nums, numForFound);
        boolean notFounded = new Searching().search(nums, numNotFound);
        System.out.println("Found in array: " + founded);
        System.out.println("Found in array: " + notFounded);

        Object[] assortedNums = new Assortment().assort(numbers, numNotFound);
        System.out.println(Arrays.toString(assortedNums));

        new SortedBy().sortedBy(numbers, 5);

        int min = new MinAndMax().findMin(numbers);
        System.out.println("The min is: " + min);
        int max = new MinAndMax().findMax(numbers);
        System.out.println("The max is: " + max);

        new Intersection().section(numbers, nums);
    }
}
