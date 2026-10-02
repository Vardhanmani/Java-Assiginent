public class LogicalOperators {

    public static void testLogicalOperators(boolean condition1, boolean condition2) {
        System.out.println( (condition1 && condition2));
        System.out.println((condition1 || condition2));
        System.out.println( (!condition1));
        System.out.println( (!condition2));
    }

    public static void main(String[] args) {
        testLogicalOperators(true, false);
    }
}