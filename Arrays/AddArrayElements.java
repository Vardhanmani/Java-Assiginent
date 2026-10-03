public class AddArrayElements {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20 };
        System.out.println("Sum: " + sum(numbers));
    }
}