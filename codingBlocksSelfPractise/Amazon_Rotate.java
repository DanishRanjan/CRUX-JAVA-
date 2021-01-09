package codingBlocksSelfPractise;
import java.util.*;
public class Amazon_Rotate {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of TC:- ");
	int TC = sc.nextInt();
	while(TC-->0)
	{
		System.out.println("Enter the elements in array:- ");
		int n = sc.nextInt();
		System.out.println("Enter the element to be rotated:- ");
		int r = sc.nextInt();
		System.out.println("Enter the element in array:- ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=r;i<n;i++)
		{
			sb.append(arr[i]+" ");
		}
		for(int i=0;i<r;i++)
		{
			sb.append(arr[i]+" ");
		}
		System.out.println(sb);
	} 
}
}  