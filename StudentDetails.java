package packagess;

public class StudentDetails {
    private final int rollNumber;
    private final String name;
    private final String course;

    public StudentDetails(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("Student roll number: " + rollNumber);
        System.out.println("Student name: " + name);
        System.out.println("Student course: " + course);
    }
}
