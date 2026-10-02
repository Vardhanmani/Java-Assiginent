public class CompareTwoNumbers {

    public static void isEqual(int x, int y) {
        if (x == y) {
            System.out.println("EQUAL.");
        } else {
            System.out.println("NOT EQUAL.");
        }
    }

    public static void main(String[] args) {
        isEqual(45, 45);
        isEqual(12, 99);
    }
}

