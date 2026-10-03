import java.util.Arrays;

public class SecondLargestNumber {
    public static int findSecondLargest(int[] values) {
        if (values.length < 2) {
            throw new IllegalArgumentException("At least two distinct values are required.");
        }

        int[] sortedValues = values.clone();
        Arrays.sort(sortedValues);
        int largest = sortedValues[sortedValues.length - 1];

        for (int index = sortedValues.length - 2; index >= 0; index--) {
            if (sortedValues[index] < largest) {
                return sortedValues[index];
            }
        }
        throw new IllegalArgumentException("At least two distinct values are required.");
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 35, 1, 10, 34, 35 };
        System.out.println("Second largest: " + findSecondLargest(numbers));
    }
}