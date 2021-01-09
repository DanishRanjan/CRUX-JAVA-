package ArraySP;
import java.util.*;
public class InsertionSort1 {
public static void main(String args[])
{
	int temp;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the element in the array:-");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the elements in the array:-");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=1;i<arr.length;i++)
	{
		temp=arr[i];
		int j=i-1; //starting point of while loop.
		while(j>=0 && arr[j]>temp)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=temp;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+",");
	}
}
}
