package HackerBlocks;

import java.util.Scanner;

public class StringString_COmpression {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(elements(str));
	}

	public static String elements(String str) {
		String arr = "" + str.charAt(0);
		int count = 0;
		int piggy = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != piggy) {
				if (count != 1) {
					arr = arr + count + str.charAt(i);
					piggy = str.charAt(i);
					count = 1;
				} else {
					arr = arr + str.charAt(i);
					piggy = str.charAt(i);
					count = 1;
				}
			} else {
				count++;
			}

		}

		if (count > 1)
			arr += count;
		return arr;
	}
}
