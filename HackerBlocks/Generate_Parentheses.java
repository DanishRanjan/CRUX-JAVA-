package HackerBlocks;

import java.util.Scanner;

public class Generate_Parentheses {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
		Parantesis(0, 0, n, "");

	}

	public static void Parantesis(int open, int close, int n, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > n || close > open) {
			return;
		}
		Parantesis(open, close + 1, n, ans + ")");

		Parantesis(open + 1, close, n, ans + "(");

		

	}

}
