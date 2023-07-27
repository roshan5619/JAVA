/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Pattern
{
	public static void main(String[] args) 
	{
	    int rows=5;
	    for(int i=1;i<=rows;i++)
	    {
	        for( int j=1;j<=i;j++)
	        {
	            System.out.print(j + " ");
	        }
	            System.out.println();
	    }
	}
}