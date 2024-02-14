package a4;

import java.util.Scanner;

public class MatrixMin {

	private static int[] minReturnRow(int a[][], int r, int c)
	{
		int min_ar[] = new int[r];
		for(int i=0;i<r;i++)
		{
			int min = 9999;
			for(int j=0;j<c;j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
				}
			}
			min_ar[i] = min;
		}
		return min_ar;
	}
	private static int[] minReturnColumn(int a[][], int r, int c)
	{
		int min_ar[] = new int[r];
		for(int i=0;i<c;i++)
		{
			int min = 9999;
			for(int j=0;j<r;j++)
			{
				if(a[j][i]<min)
				{
					min = a[j][i];
				}
			}
			min_ar[i] = min;
		}
		return min_ar;
	}
	private static int maxArray(int ar[][])
	{
		int max= 0;
		for(int i[]:ar)
		{
			for(int j:i)
			{
				if(j>max)
				{
					max=j;
				}
				
			}
		}
		return max;
	}
	private static int minArray(int ar[])
	{
		int min = 9999;
		for(int i:ar)
		{
			if (i<min)
			{
				min = i;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the dimensions of your 2D matrix: ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		int a[][] = new int[row][column];
		System.out.println("Enter your elements: ");
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<column; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int min_rows[] = MatrixMin.minReturnRow(a, row, column);
		int min_cols[] = MatrixMin.minReturnColumn(a, row, column);
		System.out.println("\nMinimum values in each row:");
		for(int i:min_rows)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("\nMinimum values in each column:");
		for(int i:min_cols)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("\nMaximum value of the matrix: " + MatrixMin.maxArray(a));
		System.out.println("\nMinimum value of the matrix: " + MatrixMin.minArray(min_cols));
		
	}

}
