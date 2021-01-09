package HackerBlocks;

import java.util.Scanner;

public class mazePath_D2_count_print {
	static int count=0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ed = in.nextInt();
		maze(ed, 1, 1, "");
		System.out.println();
		System.out.println(count);

	}
	public static void maze(int er, int cc , int cr , String ans) {
		if(er==cc && cr==er) {
			count++;
			System.out.print(ans+" ");
			return;
		}
		if(cr>er || cc>er) {
			return;
		}
		maze(er, cc+1, cr, ans+"V");
		maze(er, cc, cr+1, ans+"H");

		if((cc + cr == er + 1) || cr == cc) {
			
				maze(er, cc+1, cr + 1, ans+"D");
			
		}
	}
}
