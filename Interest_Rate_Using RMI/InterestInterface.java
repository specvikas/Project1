import java.rmi.*;
public interface InterestInterface extends Remote
{
    public float interest(float amount, float duration, float rate) throws RemoteException;
}
