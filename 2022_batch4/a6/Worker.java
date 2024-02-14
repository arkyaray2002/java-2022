package a6;

public class Worker {
	String name;
	double b_pay;
	Worker(String n, double b)
	{
		name = n;
		b_pay = b;
	}
	public void display()
	{
		System.out.println("Name : " + this.name + "Basic Pay : " + this.b_pay);
	}
}
