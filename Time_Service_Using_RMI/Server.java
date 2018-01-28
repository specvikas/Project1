import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.util.Date;

public class Server
{
    public static void main(String args[])
    {
        try
        {
            Date d = new Date();
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("TimeService",new TimeService(d));
            System.out.println("Server is connected");
        }
        catch(Exception e)
        {
            System.out.println("Server is not connected");
        }
    }
}
