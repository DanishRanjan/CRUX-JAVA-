package codingBlocksSelfPractise;
import java.util.*;
public class SubstringOps {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.nextLine();
	for(int si=0;si<str.length();si++)
	{
		for(int ei=si+1;ei<=str.length();ei++)
		{
			String ss = str.substring(si,ei);//si is included and ei is excluded
			System.out.print(ss+",");
		}
	}
}
}
