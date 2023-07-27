import java.util.Scanner;

public class Matrixadd 
{
    public static void main(String args[])
    {
        int m,n,c,d;
        Scanner input=new Scanner(System.in);
        System.out.println("No.of Rows:");
        m=input.nextInt();
        System.out.println("No.of Columns:");
        n=input.nextInt();

        int matrix1[][]=new int[m][n];
        int matrix2[][]=new int[m][n];

        int sum[][]=new int[m][n];
        System.out.println("Enter the elements of First Matrix");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                matrix1[c][d] =input.nextInt();
            }
        }
        System.out.println("Enter the elements of Second Matrix");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                matrix2[c][d] =input.nextInt();
            }
        }
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                sum[c][d] =matrix1[c][d] + matrix2[c][d];
            }
        }
        System.out.println("Sum of the matrices:");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                System.out.print(sum[c][d]+"\t");
            }
            System.out.println();
        }

    }   
}
