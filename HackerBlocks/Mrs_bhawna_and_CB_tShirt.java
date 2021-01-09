package HackerBlocks;

import java.util.Scanner;

public class Mrs_bhawna_and_CB_tShirt {
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sn.nextInt();
		while (n > 0) {
			int x = sn.nextInt();
			for (int i = 1; i <= x; i++) {
				binary(i);
			}
			System.out.println();
			n--;
		}
	
	}
	public static void binary(int n1) {
		int multiplier = 1;
		int total = 0;
		while (n1 != 0) {
			int rem = n1 % 2;
			n1 = n1 / 2;
			total += (rem * multiplier);
			multiplier *= 10;

		}
		System.out.print(total+" ");
	}
}
