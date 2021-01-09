package CrackingTheCodingInterview;
import java.util.*;
public class Unique {
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		String str  = sc.nextLine();
		str=str.toUpperCase();
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		if(count>0)
			System.out.println("Not Unique");
		else
			System.out.println("UNIQUE");
	}
}
