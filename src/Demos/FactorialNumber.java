package Demos;

//5!=1*2*3*4*5 = 120 - ascending order
//5! = 5*4*3*2*1 = 120 - descending order

public class FactorialNumber 
{

	public static void main(String[] args) 
	{
		int num = 5;
		int factorial = 1;
		for (int i=num; i>=1; i--)
		{
			factorial = factorial *i;// 5 20 60 120 120
			
		}
		System.out.println(" Factorial of a number is :" +factorial);

	}

}
