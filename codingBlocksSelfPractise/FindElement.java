package codingBlocksSelfPractise;
import java.util.*;
public class FindElement {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of elements in array:- ");
    int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the elements in the array:- ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the element to be search");
	int item = sc.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(item==arr[i])
		{
			System.out.println("Item is present in the array");
			break;
		}
		
	}
	System.out.println("Iten is not present");
	
}
}
