/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Increment
{
	public static void main(String[] args) 
	{
	    int a=12,b=12,c=14,d=14;
	    int result1,result2,result3,result4;
	    
		System.out.println("Value of a:"+a);
		result1 =++a;
		System.out.println("After Incerement:"+result1);
		
		System.out.println("Value of b:"+b);
		result2 = --b;
		System.out.println("After Decerement:"+result2);
		
		System.out.println("Value of c:"+c);
		result3 = ++c;
		System.out.println("After Incerement:"+result3);
		result3 = c++;
		System.out.println("After Incerement:"+result3);
		
		System.out.println("Value of d:"+d);
		result4 = --d;
		System.out.println("After Decerement:"+result4);
		
		
		
		
	}
}
