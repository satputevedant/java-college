import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Assignment28CalculatorServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1098);
        Assignment28CalculatorService service = new Assignment28CalculatorServiceImpl();

        registry.rebind("CalculatorService", service);
        System.out.println("RMI calculator service is running on port 1098.");
    }
}
