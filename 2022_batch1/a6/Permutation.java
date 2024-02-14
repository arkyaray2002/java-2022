package a6;

import java.util.Scanner;

public class Permutation {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string of length 3: ");
		String s = sc.nextLine();
		sc.close();
		System.out.println("All possible permutations are: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) 
			{
				for(int k = 0;k<3; k++)
				{
					if(i!=j && j!=k && k!=i)
					{
						System.out.println(s.charAt(i) +""+ s.charAt(j) +""+ s.charAt(k));
					}
				}
			}
		}
	}
}
