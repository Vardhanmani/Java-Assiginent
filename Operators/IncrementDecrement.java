public class IncrementDecrement {
    public static void demonstrateOperators(int val) {
        System.out.println("Initial Value: " + val);
        System.out.println((val++)); 
        System.out.println( val);
        System.out.println((++val));   
        System.out.println((val--)); 
        System.out.println(val);
        System.out.println((--val));   
    }

    public static void main(String[] args) {
        demonstrateOperators(10);
    }
}

