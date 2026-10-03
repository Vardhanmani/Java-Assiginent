import java.util.Arrays;

public class InsertArrayElement {
    public static int[] insert(int[] values, int position, int value) {
        if (position < 0 || position > values.length) {
            throw new IndexOutOfBoundsException("Position must be between 0 and " + values.length + ".");
        }

        int[] result = new int[values.length + 1];
        System.arraycopy(values, 0, result, 0, position);
        result[position] = value;
        System.arraycopy(values, position, result, position + 1, values.length - position);
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 40, 50 };
        System.out.println(Arrays.toString(insert(numbers, 2, 30)));
    }
}