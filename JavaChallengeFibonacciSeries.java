public class JavaChallengeFibonacciSeries                  //FIBONACCI SERIES
{
    public static void main(String args[])
    {
        int a=0, b=1, c;
        System.out.print(a+" "+b);             // FIRST PRINTING 0 and 1
        for(int i=1;i<=11;i++)                 // LOOP RUNS 11 TIMES USER CAN CHANGE IT IF THEY WANT TO
        {
            c = a + b;                         //adding
            System.out.print(" "+c);           // printing
            a = b;                             // assigning values
            b = c;
        }
    }
}
