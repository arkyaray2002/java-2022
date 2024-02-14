package a3;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("Enter the character to replace");
		char old_c= sc.nextLine().charAt(0);
		System.out.println("Enter the new character");
		char new_c= sc.nextLine().charAt(0);
		s = s.replace(old_c, new_c);
		System.out.println("New String");
		System.out.println(s);
		sc.close();
	}

}
