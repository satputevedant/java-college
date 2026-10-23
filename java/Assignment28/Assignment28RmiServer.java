import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/** Assignment 28 RMI server. */
public class Assignment28RmiServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("TemperatureService", new Assignment28TemperatureServiceImpl());
        System.out.println("RMI temperature service is running on port 1099.");
    }
}
