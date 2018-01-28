import java.rmi.Naming;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            CalculatorInterface cal = (CalculatorInterface)Naming.lookup("//localhost/calculator");
            System.out.println(cal.add(3,4));
            System.out.println(cal.sub(2,7));
            System.out.println(cal.mult(4,4));
            System.out.println(cal.div(3,6));
        }
        catch(Exception e)
        {
            System.out.println("Client Exception : " + e);
        }
    }
}
