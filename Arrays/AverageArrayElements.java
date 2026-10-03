public class AverageArrayElements {
    public static double average(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int total = 0;
        for (int value : values) {
            total += value;
        }
        return (double) total / values.length;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20 };
        System.out.println("Average: " + average(numbers));
    }
}