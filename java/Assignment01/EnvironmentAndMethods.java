public class EnvironmentAndMethods {
    static int square(int value) { return value * value; }

    public static void main(String[] args) {
        String student = args.length > 0 ? args[0] : "Student";
        int marks = args.length > 1 ? Integer.parseInt(args[1]) : 85;
        System.out.println("Student: " + student);
        System.out.println("Marks: " + marks);
        System.out.println("Square of marks: " + square(marks));
    }
}
