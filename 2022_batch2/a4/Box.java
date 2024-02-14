package a4;

public class Box {
	int length, breadth, height;
	Box(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	Box(Box box)
	{
		this.length = box.length;
		this.breadth = box.breadth;
		this.height = box.height;
	}
	int volume() 
	{
		return (length * breadth * height);
	}
}
