package RecursionMarch31;
import java.util.*;
public class permutation {

	public static void main(String[] args)
	{
	System.out.println(getP("abc"));
	}
	public static ArrayList<String> getP(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> baseCase = new ArrayList();
			baseCase.add("");
			return baseCase;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList();
		ArrayList<String> recResult = getP(ros);
		for(int i=0;i<recResult.size();i++)
		{
			String recString = recResult.get(i);
			for(int j=0;j<=recString.length();j++)
			{
				String val = recString.substring(0, j) + cc + recString.substring(j);
				myResult.add(val);
			}
		}
		return myResult;
	}

}
