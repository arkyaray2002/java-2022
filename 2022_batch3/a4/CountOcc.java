package a4;

public class CountOcc {
	public static void main(String args[])
	{
		int ar[] = {0, 2, 4, 8, 2, 9, 2, 0};
		int el = 2;
		int count = 0;
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] == el)
			{
				count ++;
				ar[i] = ar[i] + i;
			}
		}
		System.out.println(count);
		for(int x: ar)
		{
			System.out.print(x + "\t");
		}
	}
}
