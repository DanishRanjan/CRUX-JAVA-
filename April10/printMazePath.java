package April10;

public class printMazePath {

	public static void main(String[] args) {
		printMP(0, 0, 2, 2, "");

	}
	public static void printMP(int cr, int cc, int er, int ec, String ans)
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
		printMP(cr, cc+1, er, ec, ans+"H");
		printMP(cr+1, cc, er, ec, ans+"V");
	}

}
