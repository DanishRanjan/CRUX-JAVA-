package HackerBlocks;

import java.util.Scanner;

public class EditDistance {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
			String s1 = in.next();
			String s2 = in.next();
			System.out.println(EditDistancebu(s1, s2));
	        
	    }
	    public static int EditDistancebu(String s1, String s2) {
			int[][] arr = new int[s1.length() + 1][s2.length() + 1];
			for (int i = s1.length(); i >= 0; i--) {
				for (int j = s2.length(); j >= 0; j--) {
					if (i == s1.length()) {
						arr[i][j] = s2.length() - j;
						continue;
					}
					if (j == s2.length()) {
						arr[i][j] = s1.length() - i;
						continue;

					}

					if (s1.charAt(i) == s2.charAt(j)) {
						arr[i][j] = arr[i + 1][j + 1];
					} else {
						int add = arr[i + 1][j];
						int rem = arr[i][j + 1];
						int rep = arr[i + 1][j + 1];
						arr[i][j] = Math.min(rem, Math.min(add, rep)) + 1;
					}

				}
			}
			return arr[0][0];
		}
}
