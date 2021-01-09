package CrackingTheCodingInterview;

import java.util.Scanner;

public class UniqueCharacter {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:- ");
	String str = sc.nextLine();
	str = str.toUpperCase();
	int counter=0;
	for(int i=0;i<str.length()-1;i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				counter++;
				break;
			}
		}
	}
if(counter>0)
	System.out.println("String is not unique");
else
	System.out.println("Unique");
	
	
}
}
