package April10;

public class PrintMazePathDiagonal {
public static void main(String args[])
{
	PrintMPD(0, 0, 2, 2, "");
}
public static void PrintMPD(int cr, int cc, int er, int ec, String ans)
{
	if(cr==er&&cc==ec)
	{
		System.out.println(ans);
		return;
	}
	if(cr>er||cc>ec)
	{
		return;
	}
	PrintMPD(cr, cc+1, er, ec, ans+"H");
	PrintMPD(cr+1, cc, er, ec, ans+"V");
	PrintMPD(cr+1, cc+1, er, ec, ans+"D");
}
}
