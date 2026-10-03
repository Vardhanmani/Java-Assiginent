import java.util.Scanner;

public class EqualityAndInequality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Equal (==): " + (firstNumber == secondNumber));
        System.out.println("Not equal (!=): " + (firstNumber != secondNumber));
        scanner.close();
    }
}