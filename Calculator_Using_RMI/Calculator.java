import java.rmi.*;
import java.rmi.server.*;

public class Calculator extends UnicastRemoteObject implements CalculatorInterface
{
    public Calculator() throws RemoteException
    {

    }
    public int add(int a,int b) throws RemoteException
    {
        return a+b;
    }

    public int sub(int a,int b) throws RemoteException
    {
        return b-a;
    }

    public int mult(int a,int b) throws RemoteException
    {
        return a*b;
    }
    public int div(int a,int b) throws RemoteException
    {
        return b/a;
    }
}
