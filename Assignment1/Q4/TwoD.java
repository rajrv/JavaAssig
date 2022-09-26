/*Q4) Create a two dimensional array of integers and display:

    sum of all elements of each column
    sum of all elements of each row
*/
import java.util.Scanner;

public class TwoD {
    public static void main(String args[])
    {
        System.out.println("Enter number rows and column ");
        Scanner S= new Scanner(System.in);
        int r = S.nextInt();
        int c = S.nextInt();
        System.out.println("Enter elements in array");
        int[][] arr = new int[r][c];
        int sumC=0,sumR=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=S.nextInt();
            }
        }
        S.close();//Closing Scanner class

        //Calculating sum of each row and each column
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sumR+=arr[i][j];
                sumC+=arr[j][i];
            }
            System.out.println("Sum of "+(i+1)+" row "+sumR);
            System.out.println("Sum of "+(i+1)+" column "+sumC+"\n");
            sumR=0;sumC=0;
        }
    }
}
