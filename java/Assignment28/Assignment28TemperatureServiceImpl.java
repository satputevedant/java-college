import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class Assignment28TemperatureServiceImpl extends UnicastRemoteObject implements Assignment28TemperatureService {
    public Assignment28TemperatureServiceImpl() throws RemoteException {
    }

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
