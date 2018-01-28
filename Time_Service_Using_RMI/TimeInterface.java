import java.rmi.*;
import java.util.Date;
public interface TimeInterface extends Remote
{
    public Date timeService() throws RemoteException;
}
