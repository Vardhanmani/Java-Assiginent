import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] values) {
        int[] result = new int[values.length];
        for (int index = 0; index < values.length; index++) {
            result[index] = values[values.length - 1 - index];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverse(numbers)));
    }
}