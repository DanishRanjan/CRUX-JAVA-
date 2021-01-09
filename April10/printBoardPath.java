package April10;

public class printBoardPath {
public static void main(String args[])
{
	printBP(0, 10, "");
	
}
public static void printBP(int current, int end, String ans)
{
	if(current==end)
	{
		System.out.println(ans);
		return;
	}
	if(current>end)
	{
		return;
	}
	for(int dice=1;dice<=6;dice++)
	{
		printBP(current+dice, end, ans+dice);
	}
}
}
