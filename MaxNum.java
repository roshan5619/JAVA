/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class MaxNum
{
	public static void main(String[] args) 
	{
	    int a=10,b=25,c=15,max;
	    max=(a>b)?(a>c?a:c):(b>c?b:c);
	    
		System.out.println("Max Number amoung " + a+","+b+" and " + c +" is " + max);
	}
}
