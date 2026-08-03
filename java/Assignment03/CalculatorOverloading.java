public class CalculatorOverloading {
    private static int calculations;
    static int add(int a, int b) { calculations++; return a + b; }
    static double add(double a, double b) { calculations++; return a + b; }
    public static void main(String[] args) {
        System.out.println("Integer sum: " + add(4, 6));
        System.out.println("Decimal sum: " + add(2.5, 3.75));
        System.out.println("Calculations: " + calculations);
    }
}
