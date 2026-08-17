public class EnvironmentAndMethods {
    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        String studentName = "Vedant";
        int marks = 85;

        System.out.println("Student: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Square of marks: " + square(marks));
    }
}
