package HackerBlocks;

import java.util.Scanner;

public class String_odd_Even_Character {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < sb.length(); i++) {
			int n = (int) sb.charAt(i);
			if (i % 2 == 0) {
				char c = (char) (n + 1);
				sb1.append(c);
			} else {
				char c = (char) (n - 1);
				sb1.append(c);
			}
			

		}
		System.out.println(sb1);

	}
}
