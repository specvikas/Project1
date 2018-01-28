import java.rmi.*;
import java.rmi.server.*;
import java.util.Date;

public class TimeService extends UnicastRemoteObject implements TimeInterface
{
    Date date;

    public TimeService(Date time) throws RemoteException
    {
        date = time;
    }
    public Date timeService() throws RemoteException
    {
        return date;
    }
}
