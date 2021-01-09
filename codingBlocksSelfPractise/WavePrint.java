package codingBlocksSelfPractise;
import java.util.*;
public class WavePrint {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the elements in row");
	int row=sc.nextInt();
	System.out.println("Enter the element in coloumn");
	int col= sc.nextInt();
	System.out.println("Enter the elements in array orderly");
	int[][] arr = new int[row][col];
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
	  if(i%2==0)
	    {
		  for(int j=0;j<arr[i].length;j++)
		   {
			 System.out.print(arr[i][j]+",");
	    	}
	    }
	  else
	    {
		for(int j=arr[i].length-1;j>=0;j--)
		   {
			    System.out.print(arr[i][j]+",");
		   }
	    }
	}
	
	System.out.print("END");	
}
}
