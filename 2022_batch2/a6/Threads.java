package a6;

class MyThread extends Thread{
	public MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println(getName());
	}
}


public class Threads {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Hi"); 
		MyThread t2 = new MyThread("Hello"); 
		t1.start();
		t2.start();
	}

}
