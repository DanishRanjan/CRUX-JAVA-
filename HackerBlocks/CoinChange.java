package HackerBlocks;

import java.util.Scanner;

public class CoinChange {
	 public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
			int tgt = s.nextInt();
			int n = s.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			int[][] strg = new int[n+1][tgt+1];
			System.out.println(countCoinDenom(arr, 0, tgt, 0,strg));
	    }
	    public static int countCoinDenom(int[] arr, int vidx, int tgt, int res, int[][] strg) {
			if (res > tgt)
				return 0;
			if (res == tgt)
				return 1;
			if(strg[vidx][res]!=0) {
				return strg[vidx][res];
			}

			int ans = 0;
			for (int i = vidx; i < arr.length; i++) {
				ans = ans + countCoinDenom(arr, i, tgt, res + arr[i], strg);
			}
			strg[vidx][res] = ans;
			return ans;
		}
}
