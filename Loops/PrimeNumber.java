import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        boolean isPrime = number >= 2;
        for (int divisor = 2; isPrime && divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}