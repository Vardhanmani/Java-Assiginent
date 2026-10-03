public class StaticAndInstanceVariables {
    static String schoolName = "Bright School";
    static int studentCount = 100;

    String studentName = "Asha";
    int studentAge = 18;

    static void printSchoolName() {
        System.out.println("School: " + schoolName);
    }

    static void printStudentCount() {
        System.out.println("Students: " + studentCount);
    }

    void printStudentName() {
        System.out.println("Student: " + studentName);
    }

    void printStudentAge() {
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        StaticAndInstanceVariables student = new StaticAndInstanceVariables();
        printSchoolName();
        printStudentCount();
        student.printStudentName();
        student.printStudentAge();
    }
}