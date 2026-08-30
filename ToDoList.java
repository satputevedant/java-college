import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Complete Java assignment");
        tasks.add("Revise constructors");
        tasks.add("Practice collections");

        StringBuffer output = new StringBuffer("To-Do List:\n");
        for (int i = 0; i < tasks.size(); i++) {
            output.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
        }

        System.out.println(output);

        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Database Management");

        System.out.println("Registered Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}
