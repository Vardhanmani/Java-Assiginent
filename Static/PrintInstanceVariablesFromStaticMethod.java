public class PrintInstanceVariablesFromStaticMethod {
    String firstName = "Asha";
    int age = 18;

    static void printFirstName(PrintInstanceVariablesFromStaticMethod person) {
        System.out.println("Name: " + person.firstName);
    }

    static void printAge(PrintInstanceVariablesFromStaticMethod person) {
        System.out.println("Age: " + person.age);
    }

    public static void main(String[] args) {
        PrintInstanceVariablesFromStaticMethod person = new PrintInstanceVariablesFromStaticMethod();
        printFirstName(person);
        printAge(person);
    }
}