package HackerBlocks;

import java.util.Scanner;

public class Rat_andIts_Cheese {
	static int count= 0; 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] board = new char[n][m];
		for (int i = 0; i < board.length; i++) {
			String str=in.next();
			for (int j = 0; j < board[0].length; j++) {
				
				board[i][j]=str.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		rat(board, 0, 0, ans);
		if(count==0) {
			System.out.println("NO PATH FOUND");
		}
	}

	public static void rat(char board[][], int cr, int cc, int ans[][]) {

		if (cr == board.length - 1 && cc == board[0].length - 1)
		{
			count++;
			ans[cr][cc] = 1;
			
			for (int i = 0; i < ans.length; i++) {
				for (int j = 0; j < ans[0].length; j++) {
					System.out.print(ans[i][j] + " ");
				}
				System.out.println();
			}
			ans[cr][cc]=0;
			return;
		}
		if (cr < 0 || cc < 0 || cr > board.length - 1 || cc > board[0].length - 1 || board[cr][cc] == 'X') {
			return;
		}
		board[cr][cc] = 'X';
		ans[cr][cc] = 1;
		rat(board, cr, cc + 1, ans);
		rat(board, cr - 1, cc, ans);
		rat(board, cr, cc - 1, ans);
		rat(board, cr + 1, cc, ans);

		board[cr][cc] = 'O';
		ans[cr][cc] = 0;
	

	}
}
