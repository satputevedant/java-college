import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Assignment28CalculatorServiceImpl extends UnicastRemoteObject implements Assignment28CalculatorService {
    public Assignment28CalculatorServiceImpl() throws RemoteException {
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}
