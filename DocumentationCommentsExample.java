/**
 * Documentation Comment:
 * The DocumentationCommentsExample class demonstrates the usage of three different
 * types of comments available in Java: single-line, multi-line, and documentation comments.
 */
public class DocumentationCommentsExample {

    /**
     * Documentation Comment:
     * Main method which serves as the execution entry point for the application.
     */
    public static void main(String[] args) {

        // Single-line comment: Declaring integer variables 'a' and 'b'
        int a = 10; 
        int b = 20;

        /* Multi-line comment:
           The following variable 'sum' adds 'a' and 'b' together.
           Multi-line comments can span across multiple lines 
           without needing single-line slashes on every line.
        */
        int sum = a + b;

        // Single-line comment: Printing the total sum to the console
        System.out.println("The sum is: " + sum);
    }
}