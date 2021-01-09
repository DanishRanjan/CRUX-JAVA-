package HackerBlocks;

import java.util.Scanner;

public class Chessboard_Problem_count_print {
	static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ChessBoard(0, 0, n-1, n-1, "{" + 0 + "-" + 0 + "}");
		System.out.println();
		System.out.println(count);

	}

	public static void ChessBoard(int cr, int cc, int er, int ec, String ans) {
		if (er == cr && ec == cc) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		ChessBoard(cr + 2, cc + 1, er, ec, ans + "K{" + (cr + 2) + "-" + (cc + 1) + "}");
		ChessBoard(cr + 1, cc + 2, er, ec, ans + "K{" + (cr + 1) + "-" + (cc + 2) + "}");
		if (cr == 0 || cc == 0 || cr == er || cc == ec) {
			for (int i = 1; i <= ec; i++) {
				ChessBoard(cr, cc + i, er, ec, ans + "R{" + (cr) + "-" + (cc + 1) + "}");
			}

			for (int i = 1; i <= er; i++) {
				ChessBoard(cr + i, cc, er, ec, ans + "R{" + (cr + 1) + "-" + (cc) + "}");
			}
		}
		if (cr + cc == ec || cr == cc) {
			for (int i = 1; i <= ec && i <= er; i++) {
			ChessBoard(cr + i, cc + i, er, ec, ans + "B{" + (cr + 1) + "-" + (cc + 1) + "}");
			}
		}
	}
}
