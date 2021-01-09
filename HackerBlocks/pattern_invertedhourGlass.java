package HackerBlocks;

import java.util.Scanner;

public class pattern_invertedhourGlass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int nst = 1;
		int n = 2 * N;
		int nsp = n-1;
		int row = 1;
		while(row<=(n+1)) {
			int piggy = N;
			int cst = 1;
			while (cst <= nst) {
				System.out.print(piggy);
				System.out.print(" ");
				cst++;
				piggy--;
			}
			piggy++;
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				System.out.print(" ");
				csp++;
			}
			cst=1;
			while (cst <= nst) {
				if(piggy!=0) {
				System.out.print(piggy);
				System.out.print(" ");
				}
				cst++;
				piggy++;
			}
			if(row<=N) {
				nsp-=2;
				nst+=1;
			}else {
				nsp+=2;
				nst-=1;
			}
			row++;
			System.out.println();
			
		}
			

}
}
