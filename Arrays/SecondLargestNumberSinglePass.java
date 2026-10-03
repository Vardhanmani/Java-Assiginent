public class SecondLargestNumberSinglePass {
    public static int findSecondLargest(int[] values) {
        boolean hasLargest = false;
        boolean hasSecondLargest = false;
        int largest = 0;
        int secondLargest = 0;

        for (int value : values) {
            if (!hasLargest || value > largest) {
                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }
                largest = value;
                hasLargest = true;
            } else if (value < largest && (!hasSecondLargest || value > secondLargest)) {
                secondLargest = value;
                hasSecondLargest = true;
            }
        }

        if (!hasSecondLargest) {
            throw new IllegalArgumentException("At least two distinct values are required.");
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 35, 1, 10, 34, 35 };
        System.out.println("Second largest: " + findSecondLargest(numbers));
    }
}