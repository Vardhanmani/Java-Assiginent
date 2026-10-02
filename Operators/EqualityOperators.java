public class EqualityOperators {

    public static void checkEquality(int num1, int num2) {
        System.out.println((num1 == num2));
        System.out.println( (num1 != num2));
    }

    public static void main(String[] args) {
        checkEquality(15, 20);
        checkEquality(10, 10);
    }
}