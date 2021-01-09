package codingBlocksSelfPractise;
import java.util.*;
public class min_element {
public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elemennt in array:- ");
	int n= sc.nextInt();
	int[] a = new int[n];
	System.out.println("Enter the elements in array:- ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int min=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++);
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Smallest element in the array is:- "+min);
	
}
}
