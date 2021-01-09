package Lecture2;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int nst = 1;
		int value = 1;
		while (row <= n) {
			int cst = 1;
			while (cst <= nst) {
				System.out.print(value+"\t");
				cst++;
				value++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
