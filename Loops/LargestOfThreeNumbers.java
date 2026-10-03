import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int largest = firstNumber;
        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }

        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}