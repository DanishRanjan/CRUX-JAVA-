package Backtracking14April;

public class PermutationOfQueen {
	public static  int count=0;
	public static void main(String args[])
{
	QueenPermutation(new boolean[4], 2, 0, " ");
}
public static void QueenPermutation(boolean[] boxes, int tq, int qpsf, String ans)
{
	if(qpsf==tq) {
		count++;
		System.out.println(count+". "+ans);
		return;
	}
	for(int i=0;i<boxes.length;i++)
	{
		if(boxes[i]==false) {
			boxes[i]=true;
			QueenPermutation(boxes, tq, qpsf+1, ans+"q"+qpsf+"b"+i+" ");
			boxes[i]=false;
		}
	}
}
}
