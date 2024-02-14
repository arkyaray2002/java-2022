package a4;

import java.util.Scanner;

public class Cylinder extends Square {
	double height;
	
	Cylinder(double height, double side)
	{
		super(side);
		this.height =height;
	}
	double getVolume()
	{
		double vol = 3.14 * this.side * this.side * this.height;
		System.out.println("Volume of cylinder: "+ (vol));
		return Math.round(vol);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the redius and height of your cylinder: ");
		Cylinder c = new Cylinder(sc.nextDouble(), sc.nextDouble());
		c.getVolume();
	}
}

