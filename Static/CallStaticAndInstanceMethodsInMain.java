public class CallStaticAndInstanceMethodsInMain {
    static void firstStaticMethod() {
        System.out.println("First static method called");
    }

    static void secondStaticMethod() {
        System.out.println("Second static method called");
    }

    void firstInstanceMethod() {
        System.out.println("First instance method called");
    }

    void secondInstanceMethod() {
        System.out.println("Second instance method called");
    }

    public static void main(String[] args) {
        CallStaticAndInstanceMethodsInMain object = new CallStaticAndInstanceMethodsInMain();

        CallStaticAndInstanceMethodsInMain.firstStaticMethod();
        CallStaticAndInstanceMethodsInMain.secondStaticMethod();
        object.firstInstanceMethod();
        object.secondInstanceMethod();
    }
}