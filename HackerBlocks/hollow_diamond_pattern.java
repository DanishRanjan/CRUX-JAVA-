package HackerBlocks;

import java.util.Scanner;

public class hollow_diamond_pattern {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int row = 1;
		int nsp = 1;
		int nst = (N / 2) + 1;
		while (row <= N) {
			if (row == 1 || row == N) {
				int s = 1;
				while (s <= N) {
					System.out.print("*");
					System.out.print("\t");
					s++;
				}
			} else {
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					System.out.print("\t");
					cst++;
				}
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					System.out.print("\t");
					csp++;
				}
				cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					System.out.print("\t");
					cst++;
				}

			}
			if(row==1) {
				nst--;
			}else {
				if (row <= (N / 2)) {
					nst--;
					nsp += 2;
				} else {
					nst++;
					nsp -= 2;
				}
				
			}
			row++;
			System.out.println();
		}

	}
}
