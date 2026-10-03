public class PrintOddEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20:");
        for (int number = 1; number <= 20; number++) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }

        System.out.println("Odd numbers from 1 to 20:");
        for (int number = 1; number <= 20; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}