public class EmployeeManagerSuper {
    static class Employee { String name = "Ravi"; Employee() { System.out.println("Employee constructor"); } void show() { System.out.println("Employee: " + name); } }
    static class Manager extends Employee { String name = "Meera"; Manager() { super(); } void show() { super.show(); System.out.println("Manager: " + name); } }
    public static void main(String[] args) { new Manager().show(); }
}
