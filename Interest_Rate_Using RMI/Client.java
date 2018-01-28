import java.rmi.Naming;
import java.util.Scanner;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            InterestInterface intrst = (InterestInterface)Naming.lookup("//localhost/Interest");
            Scanner x = new Scanner(System.in);
            System.out.println("Enter amount : ");
            float amount = x.nextFloat();
            System.out.println("Enter duration in years : ");
            float duration = x.nextFloat();
            System.out.println("Enter monthly interest rate : ");
            float rate = x.nextFloat();
            System.out.println(intrst.interest(amount,duration,rate));
        }
        catch(Exception e)
        {
            System.out.println("Client Exception : " + e);
        }
    }
}
