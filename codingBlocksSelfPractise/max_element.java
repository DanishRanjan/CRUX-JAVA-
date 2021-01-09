package codingBlocksSelfPractise;
import java.util.*;
public class max_element {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Length of array:- ");
	int n=sc.nextInt();
	int[] a = new int[n];
	System.out.println("Enter the elements in array:- ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int max = Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Largest element in the array is:- "+max);
}
}
