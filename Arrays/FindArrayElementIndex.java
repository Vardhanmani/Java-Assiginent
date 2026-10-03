public class FindArrayElementIndex {
    public static int indexOf(int[] values, int target) {
        for (int index = 0; index < values.length; index++) {
            if (values[index] == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 8, 12, 16 };
        System.out.println("Index of 12: " + indexOf(numbers, 12));
    }
}