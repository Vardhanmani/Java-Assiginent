public class LargestOfTenTwentyThirty {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Largest number: " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Largest number: " + secondNumber);
        } else {
            System.out.println("Largest number: " + thirdNumber);
        }
    }
}