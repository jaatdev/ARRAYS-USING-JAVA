package Arrays1;
import java.util.*;

public class MinimiumOfArray {
	public static int MinOfArray(int arr[])
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+" th element of array");
			arr[i]=s.nextInt();
		}
		System.out.println("Printing array...");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int min=MinOfArray(arr);
		System.out.println(min);

		s.close();
		
	}

}
