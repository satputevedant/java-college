interface Printable {
    void printDetails();
}

class Student implements Printable {
    @Override
    public void printDetails() {
        System.out.println("Student: Rahul, Roll number: 21");
    }
}

class Employee implements Printable {
    @Override
    public void printDetails() {
        System.out.println("Employee: Amit, ID: 101");
    }
}

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] records = {new Student(), new Employee()};

        for (Printable record : records) {
            record.printDetails();
        }
    }
}
