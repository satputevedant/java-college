class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeManagerSuper extends Employee {
    String department;

    EmployeeManagerSuper(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        EmployeeManagerSuper manager = new EmployeeManagerSuper("Rahul", 50000, "IT");
        manager.display();
    }
}
