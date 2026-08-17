public class CalculatorOverloading {
    private static int calculationCount = 0;

    public static int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    public double add(double a, double b) {
        calculationCount++;
        return a + b;
    }

    public static int getCalculationCount() {
        return calculationCount;
    }

    public static void main(String[] args) {
        int sum1 = CalculatorOverloading.add(5, 10);
        System.out.println("Sum of integers: " + sum1);

        CalculatorOverloading obj = new CalculatorOverloading();
        double sum2 = obj.add(5.3, 10.5);
        System.out.println("Sum of decimals: " + sum2);

        System.out.println("Total calculations performed: " + getCalculationCount());
    }
}
