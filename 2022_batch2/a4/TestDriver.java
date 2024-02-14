package a4;

import java.util.Scanner;

public class TestDriver {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length breadth and height of your box: ");
		Box b1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
		Box b2 = new Box(b1);
		System.out.println("Volume of your box: "+b1.volume()); 
		System.out.println("Volume of your box's copy: "+b2.volume()); 
	}
}
