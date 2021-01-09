package HackerBlocks;

import java.util.Scanner;

public class pattern_mountain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int nsp = N+1;
		int nst = 1;
		int row = 1;
		while (row <=N) {
			int piggy=1;
			if(row==N) {
				nst=N-1;
			}
			int cst =1;
			while(cst<=nst) {
				System.out.print(piggy);
				System.out.print("\t");
				cst++;
				piggy++;
			}
			piggy--;
			int csp =1;
			while(csp<=nsp) {
				if(row!=N) {
				System.out.print(" ");
				System.out.print("\t");
				}
				csp++;
			}
			if(row==N) {
				System.out.print(N);
				System.out.print("\t");
			}
			
			cst =1;
			while(cst<=nst) {
				System.out.print(piggy);
				System.out.print("\t");
				cst++;
				piggy--;
			}
			nsp-=2;
			nst++;
			row++;
			System.out.println();
			
		}

	}
}
