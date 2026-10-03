public class PrintStaticVariablesFromInstanceMethod {
    static String companyName = "Bright IT";
    static int employeeCount = 50;

    void printCompanyName() {
        System.out.println("Company: " + companyName);
    }

    void printEmployeeCount() {
        System.out.println("Employees: " + employeeCount);
    }

    public static void main(String[] args) {
        PrintStaticVariablesFromInstanceMethod company = new PrintStaticVariablesFromInstanceMethod();
        company.printCompanyName();
        company.printEmployeeCount();
    }
}