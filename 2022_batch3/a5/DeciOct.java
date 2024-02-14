package a5;

import java.util.Scanner;

public class DeciOct {

	int n;
	int oct;
	int counter;
	DeciOct()
	{
		n = 0;
		oct = 0;
	}
	
	void getnum(int nn)
	{
		n = nn;
	}
	void deci_oct()
	{
		oct = oct + n%8 * (int)Math.pow(10, counter);
		counter ++;
		n /= 8;
		if(n>0)
		{
			deci_oct();
		}
		
	}
	public static void main(String[] args) {
		DeciOct o1 = new DeciOct();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number: ");
		o1.getnum(sc.nextInt());
		o1.deci_oct();
		System.out.println("Octal equivalent: ");
		System.out.println(o1.oct);
	}

}
