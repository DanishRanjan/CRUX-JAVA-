package Recursion;
import java.util.*;
public class getBP {
public static void main(String args[]) {
System.out.println(getBoardpath(0, 10));	
}
public static ArrayList<String> getBoardpath(int start, int end)
{
	if(start==end)
	{
		ArrayList<String> basecase = new ArrayList<>();
		basecase.add("");
		return basecase;
	}
	if(start>end)
	{
		ArrayList<String> basecase1 = new ArrayList<>();
		return basecase1;
	}
	ArrayList<String> myResult = new ArrayList<>();
	for(int dice=1;dice<=6;dice++)
	{
		ArrayList<String> recResult = getBoardpath(start+dice, end);
		for(int i=0;i<recResult.size();i++)
		{
			myResult.add(dice+recResult.get(i));
		}
		
	}
	return myResult;
}
}
