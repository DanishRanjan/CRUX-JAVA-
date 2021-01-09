package April10;

public class countMazePath {
public static void main(String args[])
{
	System.out.println(CountMP(0, 0, 2, 2));
}
public static int CountMP(int cr, int cc, int er, int ec)
{
	if(cr==er&&cc==ec)
	{
		return 1;
	}
	if(cr>er||cc>ec)
	{
		return 0;
	}
	int count=0;
	int HA = CountMP(cr, cc+1, er, ec);
    int VA = CountMP(cr+1, cc, er, ec);
    return HA+VA;
}

}
