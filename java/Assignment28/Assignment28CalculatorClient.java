import java.rmi.registry.LocateRegistry;

public class Assignment28CalculatorClient {
    public static void main(String[] args) throws Exception {
        Assignment28CalculatorService calculator =
                (Assignment28CalculatorService) LocateRegistry
                        .getRegistry("localhost", 1098)
                        .lookup("CalculatorService");

        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
    }
}
