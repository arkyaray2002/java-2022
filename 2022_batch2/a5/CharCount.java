package a5;

import java.util.Scanner;

public class CharCount {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
		sc.close();
		int frequency[] = new int[256];
		for(int i=0; i<s.length(); i++)
		{
			frequency[(int)s.charAt(i)] ++ ;				
		}
		for(int i=0; i<256; i++)
		{
			if(frequency[i]!=0)
			{
				System.out.println("Frequency of " + (char)i + " : " + frequency[i]);
			}
		}
	}
}
