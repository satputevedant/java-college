import java.rmi.Remote;
import java.rmi.RemoteException;

/** Assignment 28 RMI remote interface. */
public interface Assignment28TemperatureService extends Remote {
    double celsiusToFahrenheit(double celsius) throws RemoteException;
    double fahrenheitToCelsius(double fahrenheit) throws RemoteException;
}
