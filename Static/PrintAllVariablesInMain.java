public class PrintAllVariablesInMain {
    static String schoolName = "Bright School";
    static int classroomCount = 12;

    String studentName = "Asha";
    int studentAge = 18;

    public static void main(String[] args) {
        PrintAllVariablesInMain student = new PrintAllVariablesInMain();

        System.out.println("School: " + PrintAllVariablesInMain.schoolName);
        System.out.println("Classrooms: " + PrintAllVariablesInMain.classroomCount);
        System.out.println("Student: " + student.studentName);
        System.out.println("Age: " + student.studentAge);
    }
}