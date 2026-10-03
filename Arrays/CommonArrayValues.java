import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonArrayValues {
    public static int[] commonValues(int[] first, int[] second) {
        List<Integer> common = new ArrayList<>();
        for (int value : first) {
            boolean foundInSecond = false;
            for (int otherValue : second) {
                if (value == otherValue) {
                    foundInSecond = true;
                    break;
                }
            }

            if (foundInSecond && !common.contains(value)) {
                common.add(value);
            }
        }

        int[] result = new int[common.size()];
        for (int index = 0; index < common.size(); index++) {
            result[index] = common.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] first = { 1, 2, 3, 4, 5 };
        int[] second = { 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(commonValues(first, second)));
    }
}