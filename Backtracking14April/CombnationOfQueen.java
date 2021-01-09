package Backtracking14April;
public class CombnationOfQueen {
	static int count=0;
public static void main(String args[])
{
        QueenCombination(new boolean[4], 0, 2," ", -1);
}
public static void QueenCombination(boolean[] board,int qpsf, int tq,String ans, int LastBoxUsed)
{
	if(qpsf==tq)
	{
		count++;
		System.out.println(count+"."+ ans);
		return;
	}
	
	for(int i = LastBoxUsed+1;i<board.length;i++)
	{
		board[i]=true;
		QueenCombination(board, qpsf+1, tq, ans+ "q" + qpsf + "b" + i + " " , i);
		board[i]=false;
	}
}
}
