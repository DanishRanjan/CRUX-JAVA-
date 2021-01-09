package RecursionMarch31;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {
		
     System.out.println(getBP(0,10).size());
	}
	public static ArrayList<String> getBP(int current, int end)
	{
		if(current==end)
		{
			ArrayList<String> baseCase = new ArrayList<>();
			baseCase.add("");
			return baseCase;
		}
		if(current>end)
		{
			ArrayList<String> baseCase = new ArrayList<>();
			return baseCase;
		}
		
		ArrayList<String> myResult = new ArrayList<>();
		for(int dice=1;dice<=6;dice++)
		{
			ArrayList<String> recResult  = getBP(current+dice, end);
			for(int i=0;i<recResult.size();i++)
			{
				myResult.add(dice+recResult.get(i));
			}
		}
		return myResult;
	}

}
