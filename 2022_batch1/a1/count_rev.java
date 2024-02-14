package a1;

import java.util.Scanner;

public class count_rev {
	static String rev(String word)
	{
		String reverse = "";
		for(int i=word.length()-1; i>=0; i--)
		{
			reverse += word.charAt(i);
		}
		return reverse;
			
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		String s_ar[] = s.split(" ");
		System.out.println("Your string has " + (s_ar.length - 1) + " words" );
		String res = "";
		for(String x:s_ar)
		{
			res += count_rev.rev(x) + " "; 
		}
		System.out.println("Your desired output: " + res);
		
	}
}
