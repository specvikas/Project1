import java.rmi.Naming;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            TimeInterface tservice = (TimeInterface)Naming.lookup("//localhost/TimeService");
            System.out.println(tservice.timeService());
        }
        catch(Exception e)
        {
            System.out.println("Client Exception : " + e);
        }
    }
}
