public class LocalAndGlobal {
    static int number = 100;
    public static void displayVariables() {
        int number = 50;
        System.out.println("Local Variable number: " + number);
        System.out.println("Global Variable number: " + LocalAndGlobal.number);
    }
    public static void main(String[] args) {
        displayVariables();
    }
}