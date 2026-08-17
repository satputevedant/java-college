class Student {
    private String name;
    private int rollNumber;

    Student() {
        this("Sarthak", 1);
    }

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println();
    }
}

public class StudentConstructors {
    public static void main(String[] args) {
        System.out.println("===== Exercise 1 =====");
        Student student1 = new Student();
        Student student2 = new Student("Vedant", 12);
        student1.display();
        student2.display();
    }
}
