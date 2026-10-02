public class ArithmeticOperators {
    public static void calculate(double a, double b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        calculate(20, 5);
    }
}