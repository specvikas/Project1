import java.rmi.*;
public interface CalculatorInterface extends Remote
{
    public int add(int a, int b) throws RemoteException;
    public int sub(int a, int b) throws RemoteException;
    public int mult(int a, int b) throws RemoteException;
    public int div(int a, int b) throws RemoteException;

}
