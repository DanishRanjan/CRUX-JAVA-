package RecursionMarch31;
import java.util.*;
public class getMazePath {
public static void main(String args[])
{
	System.out.println(getMP(0, 0, 2, 2));
}
public static ArrayList<String> getMP(int cr, int cc, int er, int ec)
{
	if(cr==er&&cc==ec)
	{
	ArrayList<String> baseCase = new ArrayList<>();
	baseCase.add("");
	return baseCase;
	}
	if(cr>er||cc>ec)
	{
		ArrayList<String> baseCase = new ArrayList<>();
		return baseCase;
	}
	ArrayList<String> myResult= new ArrayList<>();
	ArrayList<String> recResultHorizontal = getMP(cr, cc+1, er, ec);
	for(int i=0;i<recResultHorizontal.size();i++)
	{
		myResult.add("H"+recResultHorizontal.get(i));
	}
	ArrayList<String> recResultVertical = getMP(cr+1, cc, er, ec);
	for(int i=0;i<recResultVertical.size();i++)
	{
		myResult.add("V"+recResultVertical.get(i));
	}
	ArrayList<String> recResultDiagonal = getMP(cr+1, cc+1, er, ec);
	for(int i=0;i<recResultDiagonal.size();i++)
	{
		myResult.add("D"+recResultDiagonal.get(i));
	}
	return myResult;
	
	
}
}
