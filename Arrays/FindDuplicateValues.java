import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateValues {
    public static int[] findDuplicates(int[] values) {
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < values.length; index++) {
            boolean alreadyRecorded = false;
            for (int duplicate : duplicates) {
                if (duplicate == values[index]) {
                    alreadyRecorded = true;
                    break;
                }
            }

            if (alreadyRecorded) {
                continue;
            }

            for (int nextIndex = index + 1; nextIndex < values.length; nextIndex++) {
                if (values[index] == values[nextIndex]) {
                    duplicates.add(values[index]);
                    break;
                }
            }
        }

        int[] result = new int[duplicates.size()];
        for (int index = 0; index < duplicates.size(); index++) {
            result[index] = duplicates.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 2, 6, 4, 8, 2 };
        System.out.println(Arrays.toString(findDuplicates(numbers)));
    }
}