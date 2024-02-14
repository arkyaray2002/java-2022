package a3;

public class Gradient_check {
	public static void main(String args[])
	{
		Mypoint p1 = new Mypoint();
		Mypoint p2 = new Mypoint(2, 3);
		p1.getData();
		System.out.println("Gradient of p1(" + p1.x +", " + p1.y + ") and p2(" + p2.x + ", " + p2.y + ") :" + Mypoint.lineSegment(p1, p2));
	}
}
