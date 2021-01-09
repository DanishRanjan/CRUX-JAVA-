package CrackingTheCodingInterview;
import java.util.*;
public class PermutationOrNot {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First String:- ");
	String one = sc.nextLine();
	one=one.toLowerCase();
	
	System.out.println("Enter the second string to check:- ");
	String two = sc.nextLine();
	two = two.toLowerCase();
	
	if(one.length()==two.length())
	{
		String OPS = sorting(one);
		String OPSC = sorting(two);
		if(OPS.equals(OPSC))
		{
			System.out.println("Yes it is a Permutation");
		}
		else
		{
			System.out.println("Not a permutation");
		}
	}
	else
	{
		System.out.println("Not a Permutation.");
	}
	
}
public static String sorting(String str)
{
    char tempArray[]= str.toCharArray();
    Arrays.sort(tempArray);
    return new String(tempArray);
}
}
