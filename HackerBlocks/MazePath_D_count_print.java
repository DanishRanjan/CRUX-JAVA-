package HackerBlocks;

import java.util.Scanner;

public class MazePath_D_count_print {
	static int count = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ed = in.nextInt();
		int ec = in.nextInt();
		maze(ed, ec, 1, 1, "");
		System.out.println();
		System.out.println(count);

	}

	public static void maze(int er, int ec, int cr, int cc, String ans) {
		if (er == cr && ec == cc) {
			count++;
			System.out.print(ans + " ");
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		maze(er, ec, cr + 1, cc, ans + "V");
		maze(er, ec, cr, cc + 1, ans + "H");
		maze(er, ec, cr + 1, cc + 1, ans + "D");
	}

}
