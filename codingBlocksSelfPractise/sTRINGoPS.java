package codingBlocksSelfPractise;

import java.util.Scanner;

public class sTRINGoPS {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	outputString(str);
	
	
}
public static void outputString(String str)
{
	for(int i=0;i<str.length();i++)
	{
		System.out.println(str.charAt(i));
	}
}
}

