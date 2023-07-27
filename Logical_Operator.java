/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Logical_Operator
{
	public static void main(String[] args) 
	{
		System.out.println((5>3) && (8>5));//true
		System.out.println((5>3) && (8<5));//false
		System.out.println((5<3) && (8>5));//false
		System.out.println((5<3) || (8>5));//true
		System.out.println((5>3) || (8<5));//true
		System.out.println((5<3) || (8<5));//false
		System.out.println(!(5==3));//true
		System.out.println(!(5>3));//false
	}
}
