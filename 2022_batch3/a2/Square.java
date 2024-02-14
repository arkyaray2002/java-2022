package a2;

public class Square {

	double side;
	Square(double side)
	{
		this.side = side;
	}
	double getVolume()
	{
		double vol = Math.pow(this.side, 3);
		System.out.println("VOlume of square: "+ vol);
		return vol;
	}

}
