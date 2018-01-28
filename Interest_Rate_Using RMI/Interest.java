import java.rmi.*;
import java.rmi.server.*;


public class Interest extends UnicastRemoteObject implements InterestInterface
{
    public Interest() throws RemoteException
    {

    }
    public float interest(float amount,float duration,float rate) throws RemoteException
    {
        return (duration*12*amount*rate)/100;
    }
}
