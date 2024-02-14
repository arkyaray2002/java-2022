package a6;

public class Wages extends Worker {
	int hour;
	double rate;
	double wage;
	
	Wages(String n,double b, int h, double r)
	{
		super(n, b);
		hour = h;
		rate = r;
	}
	double overtime()
	{
		return hour*rate;
	}
	public void display()
	{
		wage = overtime() + b_pay;
		System.out.println("Name: " + this.name + "\tbasic pay: " + this.b_pay + "\tHours: " + this.hour + "\tRate: " + this.rate + "\tWage: " + this.wage);
	}
}
