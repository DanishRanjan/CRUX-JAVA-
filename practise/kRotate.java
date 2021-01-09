package practise;
import java.util.*;
public class kRotate {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of an array:- ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the elements in array");
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Rotate upto? :-  ");
	int k =sc.nextInt();
	StringBuilder sb =new StringBuilder();
	for(int i=k;i<n;i++)
	{
		sb.append(arr[i]+" ");
		
	}
	for(int j=0;j<k;j++)
	{
		sb.append(arr[j]+" ");
	}
	System.out.println(sb);   
}

}
