package HackerBlocks;

import java.util.Scanner;

public class pattern_triangle {
	 public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int N = in.nextInt();
			int nsp = N - 1;
			int nst = 1;
			int row = 1;
			while (row <= N) {
				int piggy = row;
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					System.out.print("\t");
					csp++;
				}
				int cst = 1;
				while (cst <= nst) {
					if (cst <= (nst / 2)) {
						System.out.print(piggy);
						System.out.print("\t");
						piggy++;
					} else {
						System.out.print(piggy);
						System.out.print("\t");
						piggy--;

					}
					cst++;
				}
				nsp--;
				nst += 2;
				row++;
				System.out.println();
			}

		}
}
