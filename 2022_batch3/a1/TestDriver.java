package a1;

public class TestDriver {
	public static void main(String args[])
	{
		double x = 6.0;
		double y = 9.0;
		
		CalcArea a = new CalcArea();
		System.out.println("Area of square: " + a.area(x));
		System.out.println("Area of rectangle: " + a.area(x, y));
		
	}
}
