public class FindMinMax {

    public static void printSmallerAndLarger(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("Both numbers are equal " );
        } else if (num1 > num2) {
            System.out.println("Larger Number: " + num1);
            System.out.println("Smaller Number: " + num2);
        } else {
            System.out.println("Larger Number: " + num2);
            System.out.println("Smaller Number: " + num1);
        }
    }

    public static void main(String[] args) {
        printSmallerAndLarger(50, 15);
        printSmallerAndLarger(50, 50);
    }
}