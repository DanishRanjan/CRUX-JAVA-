package ArraySP;
import java.util.*;
public class StringSorting {
public static void main(String args[])
{
	String temp;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number of names to be entered:- ");
	int n = sc.nextInt();
	String[] names = new String[n];
	System.out.println("Enter the names below :- ");
	for(int i=0;i<names.length;i++)
	{
		names[i] = sc.next();
	}
	 
	
	for(int i=0;i<names.length;i++)
	{
		for(int j=0;j<names.length-1-i;j++)
		{
			if(names[j].compareTo(names[j+1])>0)
			{
				temp=names[j];
				names[j]=names[j+1];
				names[j+1]=temp;
			}
		}
	}
	for(int i=0;i<names.length;i++)
	{
		System.out.print(names[i]+",");
	}
	
}
}
