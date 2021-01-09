package April10;

public class countBP {
public static void main(String args[])
{
	System.out.println(countBoardPath(0, 10));
}
public static int countBoardPath(int current, int end)
{
	if(current==end) {
		return 1;
	}
	if(current>end)
	{
		return 0;
	}
	int count=0;
	for(int dice=1;dice<=6;dice++)
	{
		count += countBoardPath(current+dice, end);
	}
	return count;
}
}
