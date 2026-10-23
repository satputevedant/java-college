import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/** Assignment 28 RMI client. */
public class Assignment28RmiClient {
    public static void main(String[] args) throws Exception {
        double celsius = args.length > 0 ? Double.parseDouble(args[0]) : 25;
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        Assignment28TemperatureService service = (Assignment28TemperatureService) registry.lookup("TemperatureService");
        System.out.printf("%.2f C = %.2f F%n", celsius, service.celsiusToFahrenheit(celsius));
    }
}
