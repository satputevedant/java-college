public class StudentConstructors {
    static class Student {
        String name;
        int rollNumber;
        Student() { this("Unknown", 0); }
        Student(String name, int rollNumber) { this.name = name; this.rollNumber = rollNumber; }
        void display() { System.out.println(name + " (Roll No. " + rollNumber + ")"); }
    }
    public static void main(String[] args) {
        new Student().display();
        new Student("Asha", 101).display();
    }
}
