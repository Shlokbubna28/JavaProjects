
import java.util.Scanner;
public class JavaChallengePrimeno
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);

       // FIRST ENTER A VALUE, THEN TAKE IT AS AN INPU

        System.out.println("Enter a number: ");    //Taking number input
        int num = sc.nextInt();

       int i, m=0,flag =0;
       m = num/2;

       if(num ==0 || num ==1)
       {
           System.out.println("It is not a prime number");
       }
       else
       {
           for(i=2; i<=m; i++)
           {
               if(num%i==0)
               {
                   System.out.println("It is not a prime number");
                   flag = 1;
                   break;
               }
           }
           if(flag ==0)
           {
               System.out.println("It is a prime number ");
           }
       }

    }
}
