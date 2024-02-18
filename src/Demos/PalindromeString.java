package Demos;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
		String str = "MADAM";
		int i=0;
		int j = str.length()-1;

		while (i<j)
		{
			if (str.charAt(i) != str.charAt(j))
			{
			System.out.println("it is not a palindrome string");
			System.exit(0);
			}
			i++;
			j--;
		}
			System.out.println("it is a palindrome string");

		
		}

	

}

