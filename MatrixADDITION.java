import java.util.Scanner;           
public class Boirough
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = { {1,3,4},{2,4,3},{3,4,5} };           // assigning array 1 the values
        int b[][] = { {1,3,4},{2,4,3},{1,2,4} };           // assigning array 2 the values

        int c[][] = new int[3][3];                    // this array is taken for finding the sum of both the arrays
                                                      // 3 rows 3 columns


        for(int i=0;i<3;i++)           // rows
        {
            for(int j=0;j<3;j++)           // columns
            {
                c[i][j] = a[i][j] + b[i][j];           // summing
                System.out.print(c[i][j]+" ");                       // printing
            }

        }

    }

}
