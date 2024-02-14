package a2;

import java.util.Scanner;


class NegativeException extends Exception
{
	
	public NegativeException(String msg)
	{
		super(msg);
	}
}
public class NegativeExceptionCheck {
	public static void myMethod() throws NegativeException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in your array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of your array: ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			if(a[i] < 0)
			{
				throw new NegativeException("Cannot enter negative values as input");
			}
		}
	}
	public static void main(String args[])
	{
		try
		{
			myMethod();
			System.out.println("Values accepted");
		}
		catch(NegativeException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}

