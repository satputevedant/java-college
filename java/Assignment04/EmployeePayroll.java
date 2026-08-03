public class EmployeePayroll {
    public static void main(String[] args) {
        Integer employeeId = Integer.valueOf("1001");
        Double basicSalary = Double.valueOf("42000.00");
        Double bonus = Double.valueOf("5000.00");
        if (employeeId <= 0 || basicSalary < 0 || bonus < 0) throw new IllegalArgumentException("Invalid payroll value");
        System.out.printf("Employee %d net salary: Rs. %.2f%n", employeeId, basicSalary + bonus);
    }
}
