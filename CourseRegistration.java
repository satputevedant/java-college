import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class CourseRegistration {
    static void displayCourses(ArrayList<String> courses, Vector<String> courseHistory) {
        StringBuffer sb = new StringBuffer("Registered Courses:\n");
        if (courses.isEmpty()) {
            sb.append("No courses registered.\n");
        } else {
            for (String course : courses) {
                sb.append("- ").append(course).append("\n");
            }
        }
        sb.append("Course History (Vector): ").append(courseHistory).append("\n");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Database Management");

        Vector<String> courseHistory = new Vector<>(courses);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add course");
            System.out.println("2. Remove course");
            System.out.println("3. View registered courses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter course to add: ");
                    String add = scanner.nextLine();
                    if (courses.contains(add)) {
                        System.out.println("Course already registered.");
                    } else {
                        courses.add(add);
                        courseHistory.add(add);
                        System.out.println("Course added.");
                    }
                    break;
                case "2":
                    System.out.print("Enter course to remove: ");
                    String remove = scanner.nextLine();
                    if (courses.remove(remove)) {
                        System.out.println("Course removed.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case "3":
                    displayCourses(courses, courseHistory);
                    break;
                case "4":
                    System.out.println("Thank You!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
