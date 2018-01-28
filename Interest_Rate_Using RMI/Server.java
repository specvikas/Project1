import java.rmi.Naming;
import java.rmi.registry.Registry;

public class Server
{
    public static void main(String args[])
    {
        try
        {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Interest",new Interest());
            System.out.println("Server is connected");
        }
        catch(Exception e)
        {
            System.out.println("Server is not connected");
        }
    }
}
