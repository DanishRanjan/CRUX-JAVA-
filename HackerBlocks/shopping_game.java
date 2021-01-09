package HackerBlocks;

import java.util.Scanner;

public class shopping_game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int count = 0;
		while (count < len) {
			int M = in.nextInt();
			int N = in.nextInt();
			int co = 1;
			boolean x =true;
			while (x==true) {
				M -= co;
				co++;
				if (M < 0) {
					System.out.println("Harshit");
					break;
				}
				N -= co;
				co++;
				if (N < 0) {
					System.out.println("Aayush");
					break;
				}
			}

			count++;

		}

	}
}
