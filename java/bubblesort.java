import java.io.*;
import java.util.*;
public class bubblesort
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements to sort: ");
		int n = scan.nextInt();
		int[] a;
		a = new int[n];
		System.out.println("Enter the elements to sort ");
		int i = 0;
		for(i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("Elements after bubble sort ");
		int j = 0;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					a[j]=a[j+1]+a[j];
					a[j+1]=a[j]-a[j+1];
					a[j]=a[j]-a[j+1];
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
		
