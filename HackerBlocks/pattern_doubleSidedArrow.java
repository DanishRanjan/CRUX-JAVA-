package HackerBlocks;

import java.util.Scanner;

public class pattern_doubleSidedArrow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int nsp = N - 1;
		int nsp2 = 1;
		int nst = 1;
		int row = 1;
		int piggy=0;
		while (row <= N) {
			if (row<=(N/2)) {
				piggy=row;
			}else {
				piggy=N-row+1;
			}
			if (row == 1 || row == N) {
				int csp = 0;
				while (csp <= nsp) {
					System.out.print(" ");
					System.out.print(" ");
					csp++;
				}
				System.out.print(piggy);
				System.out.print(" ");

			} else {
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					System.out.print(" ");
					csp++;
				}
				int cst = 1;
				while (cst <= nst) {
					System.out.print(piggy);
					System.out.print(" ");
					cst++;
					piggy--;
				}
				piggy++;
				csp = 1;
				while (csp <= nsp2) {
					System.out.print(" ");
					System.out.print(" ");
					csp++;
				}
				cst = 1;
				while (cst <= nst) {
					System.out.print(piggy);
					System.out.print(" ");
					cst++;
					piggy++;
				}

			}
			if (row <= (N / 2)) {
				nsp -= 2;
				nst += 1;
				nsp2 += 2;
			} else {
				nsp += 2;
				nst -= 1;
				nsp2 -= 2;
			}
			row++;
			System.out.println();

		}

	}
}
