package April10;

public class CountMazePathDiagonal {
public static void main(String args[])
{
	System.out.println(CountMPD(0, 0, 2, 2));
}
public static int CountMPD(int cr,int cc, int er, int ec)
{
	if(cr==er&&cc==ec)
	{
		return 1;
	}
	if(cr>er||cc>ec)
	{
		return 0;
	}
	int CH = CountMPD(cr, cc+1, er, ec);
	int CV =CountMPD(cr+1, cc, er, ec);
	int CD =CountMPD(cr+1, cc+1, er, ec);
	return  CH+CV+CD;
}
}
