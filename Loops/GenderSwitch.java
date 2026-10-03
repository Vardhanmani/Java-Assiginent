import java.util.Scanner;

public class GenderSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter M or F: ");
        char gender = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        switch (gender) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input. Enter M or F.");
        }
    }
}