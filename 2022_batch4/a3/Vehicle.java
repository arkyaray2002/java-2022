package a3;

interface Engine
{
	void speedUp(int speed);
	void changeGear(int gear);
}

public class Vehicle implements Engine {
	int speed;
	int gear;
	Vehicle(int s, int g)
	{
		speed = s;
		gear = g;
	}
	public void speedUp(int speed)
	{
		this.speed = speed;
	}
	public void changeGear(int gear)
	{
		this.gear = gear;
	}
	public static void main(String args[])
	{
		Vehicle v = new Vehicle(20, 4);
		System.out.println("Intial speed and gear: " + v.speed + " " +  v.gear);
		v.speedUp(30);
		v.changeGear(5);
		System.out.println("New speed and gear: " + v.speed + " " +  v.gear);
	}
}
