package practise;
import java.util.*;
public class oneIsPermutationOfOther {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String:- ");
	String str = sc.nextLine();
	str=str.toLowerCase();
	
	System.out.println("Enter the another string to check");
	String st = sc.nextLine();
	st=st.toLowerCase();
	
	if(str.length()==st.length())
	{
		String OPS=sortString(str);
		String OPSC=sortString(st);
		if(OPS.equals(OPSC))
			{
				System.out.println("yes it is a permutation");
			}
		else
		{
		System.out.println("It is not a permutation");	
		}

		
	}
	
	else
	{
		System.out.println("it is not a permutation");
	}
	
	
	
}

public static String sortString(String inputString)
{
	char tempArray[] = inputString.toCharArray();
	Arrays.sort(tempArray);
	return new String(tempArray);
}


}
