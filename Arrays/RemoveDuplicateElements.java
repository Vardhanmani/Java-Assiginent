import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static int[] removeDuplicates(int[] values) {
        Set<Integer> uniqueValues = new LinkedHashSet<>();
        for (int value : values) {
            uniqueValues.add(value);
        }

        int[] result = new int[uniqueValues.size()];
        int index = 0;
        for (int value : uniqueValues) {
            result[index++] = value;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 2, 4, 1, 2, 3 };
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }
}