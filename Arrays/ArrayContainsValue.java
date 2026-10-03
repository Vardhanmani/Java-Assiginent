public class ArrayContainsValue {
    public static boolean contains(int[] values, int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = { 3, 6, 9, 12 };
        System.out.println("Contains 9: " + contains(numbers, 9));
    }
}