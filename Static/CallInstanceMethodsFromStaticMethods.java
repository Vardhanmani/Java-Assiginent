public class CallInstanceMethodsFromStaticMethods {
    void firstInstanceMethod() {
        System.out.println("First instance method called");
    }

    void secondInstanceMethod() {
        System.out.println("Second instance method called");
    }

    static void callFirstInstanceMethod(CallInstanceMethodsFromStaticMethods object) {
        object.firstInstanceMethod();
    }

    static void callSecondInstanceMethod(CallInstanceMethodsFromStaticMethods object) {
        object.secondInstanceMethod();
    }

    public static void main(String[] args) {
        CallInstanceMethodsFromStaticMethods object = new CallInstanceMethodsFromStaticMethods();
        callFirstInstanceMethod(object);
        callSecondInstanceMethod(object);
    }
}