import java.util.Arrays;

public class CopyArray {
    public static int[] copy(int[] values) {
        return values.clone();
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] copiedNumbers = copy(numbers);
        System.out.println(Arrays.toString(copiedNumbers));
    }
}