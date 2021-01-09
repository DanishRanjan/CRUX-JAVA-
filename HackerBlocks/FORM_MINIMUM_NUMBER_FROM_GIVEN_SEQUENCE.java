package HackerBlocks;

import java.util.Scanner;

public class FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int tc = in.nextInt();

		while (tc > 0) {
			String str = in.next();

			int count = 1;

			int[] ans = new int[str.length() + 1];

			for (int i = 0; i <= str.length(); i++) {

				if (i == str.length() || str.charAt(i) == 'I') {

					ans[i] = count;
					count++;

					for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
						ans[j] = count;
						count++;
					}
				}
			}

			for (int val : ans) {
				System.out.print(val);
			}
			System.out.println();
			tc--;
		}
	}
}
