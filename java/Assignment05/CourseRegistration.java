import java.util.ArrayList;
import java.util.Vector;

public class CourseRegistration {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Programming with Java");
        courses.add("Database Systems");
        courses.remove("Database Systems");
        Vector<String> history = new Vector<>(courses);
        StringBuffer result = new StringBuffer("Registered courses: ");
        result.append(history);
        System.out.println(result);
    }
}
