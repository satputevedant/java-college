public class PrintableDemo {
    interface Printable { void print(); }
    static class Student implements Printable { public void print() { System.out.println("Printable student record"); } }
    static class Employee implements Printable { public void print() { System.out.println("Printable employee record"); } }
    public static void main(String[] args) { Printable[] records = { new Student(), new Employee() }; for (Printable record : records) record.print(); }
}
