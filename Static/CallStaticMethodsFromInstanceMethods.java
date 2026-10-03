public class CallStaticMethodsFromInstanceMethods {
    static void firstStaticMethod() {
        System.out.println("First static method called");
    }

    static void secondStaticMethod() {
        System.out.println("Second static method called");
    }

    void callFirstStaticMethod() {
        CallStaticMethodsFromInstanceMethods.firstStaticMethod();
    }

    void callSecondStaticMethod() {
        CallStaticMethodsFromInstanceMethods.secondStaticMethod();
    }

    public static void main(String[] args) {
        CallStaticMethodsFromInstanceMethods object = new CallStaticMethodsFromInstanceMethods();
        object.callFirstStaticMethod();
        object.callSecondStaticMethod();
    }
}