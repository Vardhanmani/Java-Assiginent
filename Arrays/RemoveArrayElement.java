import java.util.Arrays;

public class RemoveArrayElement {
    public static int[] removeFirst(int[] values, int target) {
        int targetIndex = -1;
        for (int index = 0; index < values.length; index++) {
            if (values[index] == target) {
                targetIndex = index;
                break;
            }
        }

        if (targetIndex == -1) {
            return values.clone();
        }

        int[] result = new int[values.length - 1];
        System.arraycopy(values, 0, result, 0, targetIndex);
        System.arraycopy(values, targetIndex + 1, result, targetIndex, values.length - targetIndex - 1);
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 6, 4, 8 };
        System.out.println(Arrays.toString(removeFirst(numbers, 4)));
    }
}