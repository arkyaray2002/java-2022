package a3;

import java.util.Scanner;

public class Mypoint {
	int x, y;
	public Mypoint()
	{
		this.x = 0;
		this.y = 0;
	}
	public Mypoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x and y co-ordinate: ");
		this.x = sc.nextInt();
		this.y = sc.nextInt();
		sc.close();
	}
	public static double lineSegment(Mypoint m, Mypoint n)
	{
		double gradient = (double)((n.y-m.y))/(double)((n.x-m.x));
		return gradient;
	}
}
