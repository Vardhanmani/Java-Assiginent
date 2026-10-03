public class MissingNumberOneToHundred {
    public static int findMissingNumber(int[] sortedValues) {
        int expectedSum = 100 * 101 / 2;
        int actualSum = 0;
        for (int value : sortedValues) {
            actualSum += value;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[99];
        int index = 0;
        for (int number = 1; number <= 100; number++) {
            if (number != 37) {
                numbers[index++] = number;
            }
        }
        System.out.println("Missing number: " + findMissingNumber(numbers));
    }
}