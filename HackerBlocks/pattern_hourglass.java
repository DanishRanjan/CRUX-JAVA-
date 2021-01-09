package HackerBlocks;

import java.util.Scanner;

public class pattern_hourglass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int nsp = 0;
		int n = 2 * N;
		int nst = (n + 1);
		int row = 1;
		int piggy = 0;
		while (row <= (n + 1)) {
			if (row <= N) {
				piggy = N - row + 2;
			} else {
				piggy = row - N;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while (cst < nst) {
				if (cst<=(nst/2)) {
					piggy--;
					System.out.print(piggy);
					System.out.print(" ");
				} else {
					piggy++;
					System.out.print(piggy);
					System.out.print(" ");

				}
				cst++;
			}
			if (row <= N) {
				nst -= 2;
				nsp += 2;
			} else {
				nst += 2;
				nsp -= 2;
			}
			row++;
			System.out.println();

		}

	}
}
