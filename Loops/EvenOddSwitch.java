import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        switch (Math.abs(number % 2)) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
                System.out.println(number + " is odd.");
                break;
            default:
                System.out.println("Unable to determine whether the number is even or odd.");
        }
    }
}