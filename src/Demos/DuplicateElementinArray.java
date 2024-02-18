package Demos;

public class DuplicateElementinArray 
{

	public static void main(String[] args) 
	{
		//String arr[]={"1","2", "3", "4", "1"};
		int arr[]={2,3,4,3,5,2,4,1,2};
		boolean flag = false;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])//5==5
				{
					System.out.println("Duplicate element found :"+arr[i]);
					flag = true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate element not found");

		}
		

	}

}
