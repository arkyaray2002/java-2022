package a5;


public class LongestConsecCheck {
	static int[] sort(int[] a)
	{
		for(int i=0;i < a.length - 1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j] < a[i])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	static int max(int[] a)
	{
		int max_val = 0;
		for(int x:a)
		{
			if (max_val < x)
			{
				max_val = x;
			}
		}
		return max_val;
		
	}
	public static void main(String args[])
	{
		int count[] = new int[100];
		int freq = 0,k = 0;
		int arr[] = {1, 30, 5, 2, 40, 50, 3};
		arr = LongestConsecCheck.sort(arr);
		for(int i=0;i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1] - 1)
			{
				freq ++ ;
			}
			else
			{
				count[k] = freq;
				k ++;
			}
		}
		System.out.println(LongestConsecCheck.max(count));
		
	}
}

