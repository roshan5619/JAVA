/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class HollowPattern
{
	public static void main(String[] args) 
	{
	   int size=5;
	   for(int i=0;i<size;i++)
	   {
	       for(int j=0;j<size;j++)
	       {
    	       if(i== 0 || i ==size-1)
        	       {
        	           System.out.print("*");
        	       }
    	       else
        	       {
        	         if(j == 0 || j==size-1)
        	         {
        	             System.out.print("*");
        	         }
        	         else
        	         {
        	             System.out.print(" ");
        	         }
        	       }
        	   
	       }
	   System.out.println();
	    }
    }
}
