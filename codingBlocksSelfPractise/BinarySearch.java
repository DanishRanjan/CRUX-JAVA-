package codingBlocksSelfPractise;
import java.util.*;
public class BinarySearch {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("How many elements are in array:-");
	int n = sc.nextInt();
	int[] array = new int[n];
;	System.out.println("Enter the elements in array:-");
	for(int i=0;i<array.length;i++) 
	{
	      array[i] =sc.nextInt();
	}
	//{5,7,10,12,15,20,27,31,36,42,55,58,60,65,70,80};
	System.out.println("Enter the element to be searched");
	int item = sc.nextInt();
	
	System.out.println(BinarySearchAlgo(array,item));
}

public static int BinarySearchAlgo(int[] arr,int item)
{
	int low=0;
	int high=arr.length-1;
	
	while(low<=high) 
	{
		int mid = (low+high)/2;
		if(arr[mid]<item)
		{
			low=mid+1;
		}
		else if(arr[mid]>item)
		{
		high=mid-1;	
		}
		else
		{
			return mid;
		}
	}
	return -1;
}
}

//5
//7
//10
//12
//15
//20
//27
//31
//36
//42
//55
//58
//60
//65
//70
//80
