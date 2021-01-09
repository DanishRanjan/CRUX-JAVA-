package ArraySP;
import java.util.*;
public class InsertionSort2 {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements in the array:- ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the elements in the array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=1;i<arr.length;i++)
	{
		int temp=arr[i]; 
		int j=i-1;
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
