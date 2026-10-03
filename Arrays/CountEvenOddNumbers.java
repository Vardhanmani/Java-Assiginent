public class CountEvenOddNumbers {
    public static int[] countEvenAndOdd(int[] values) {
        int evenCount = 0;
        int oddCount = 0;
        for (int value : values) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[] { evenCount, oddCount };
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int[] counts = countEvenAndOdd(numbers);
        System.out.println("Even: " + counts[0] + ", odd: " + counts[1]);
    }
}