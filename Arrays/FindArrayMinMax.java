public class FindArrayMinMax {
    public static int[] findMinMax(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        int minimum = values[0];
        int maximum = values[0];
        for (int value : values) {
            if (value < minimum) {
                minimum = value;
            }
            if (value > maximum) {
                maximum = value;
            }
        }
        return new int[] { minimum, maximum };
    }

    public static void main(String[] args) {
        int[] numbers = { 18, 5, 42, 11, 27 };
        int[] result = findMinMax(numbers);
        System.out.println("Minimum: " + result[0] + ", maximum: " + result[1]);
    }
}