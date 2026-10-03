import java.util.Scanner;

public class ArmstrongNumber {
    private static int integerPower(int base, int exponent) {
        int result = 1;
        for (int count = 0; count < exponent; count++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println(number + " is not an Armstrong number.");
            return;
        }

        int digits = String.valueOf(number).length();
        int remaining = number;
        int sum = 0;
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += integerPower(digit, digits);
            remaining /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}