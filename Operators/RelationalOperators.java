public class RelationalOperators {

    public static void compareValues(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a < b  : " + (a < b));  
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a > b  : " + (a > b));   
        System.out.println("a >= b : " + (a >= b));  
    }

    public static void main(String[] args) {
        compareValues(10, 25);
    }
}