import java.util.Scanner;

public class MarksWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Python marks: ");
        String pythonMarks = sc.nextLine();

        System.out.print("Enter Java marks: ");
        String javaMarks = sc.nextLine();

        System.out.print("Enter C++ marks: ");
        String cppMarks = sc.nextLine();

        int totalMarks = Integer.parseInt(pythonMarks)
                + Integer.parseInt(javaMarks)
                + Integer.parseInt(cppMarks);

        System.out.println("Total Marks: " + totalMarks);
        sc.close();
    }
}
