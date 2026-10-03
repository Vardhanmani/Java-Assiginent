import java.util.Arrays;

public class RemoveDuplicatesReturnArray {
    public static int[] removeDuplicates(int[] values) {
        int uniqueCount = 0;
        for (int index = 0; index < values.length; index++) {
            boolean alreadyIncluded = false;
            for (int previous = 0; previous < index; previous++) {
                if (values[previous] == values[index]) {
                    alreadyIncluded = true;
                    break;
                }
            }
            if (!alreadyIncluded) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        int resultIndex = 0;
        for (int index = 0; index < values.length; index++) {
            boolean alreadyIncluded = false;
            for (int previous = 0; previous < index; previous++) {
                if (values[previous] == values[index]) {
                    alreadyIncluded = true;
                    break;
                }
            }
            if (!alreadyIncluded) {
                result[resultIndex++] = values[index];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 2, 4, 1, 2, 3 };
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }
}