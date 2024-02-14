package a2;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		System.out.println("Specify the starting and ending positions of your substring: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		System.out.println("Your desired output: ");
		System.out.println(str.substring(start, end));
	}

}
