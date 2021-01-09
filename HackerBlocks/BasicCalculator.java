package HackerBlocks;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean x = true;
		while (x == true) {
			char n = in.next().charAt(0);
			if (n == '+' || n == '-' || n == '*' || n == '/' || n == '%' || n == 'x' || n == 'X') {
				if (n == '+') {
					int n1 = in.nextInt();
					int n2 = in.nextInt();
					int sum = n1 + n2;
					System.out.println(sum);
				}
				if (n == '-') {
					int n1 = in.nextInt();
					int n2 = in.nextInt();
					int sum = n1 - n2;
					System.out.println(sum);
				}
				if (n == '*') {
					int n1 = in.nextInt();
					int n2 = in.nextInt();
					int sum = n1 * n2;
					System.out.println(sum);
				}
				if (n == '/') {
					int n1 = in.nextInt();
					int n2 = in.nextInt();
					int sum = n1 / n2;
					System.out.println(sum);
				}
				if (n == '%') {
					int n1 = in.nextInt();
					int n2 = in.nextInt();
					int sum = n1 % n2;
					System.out.println(sum);
				}
				if (n == 'x' || n == 'X') {
					x = false;

				}

			} else {
				System.out.println("Invalid operation. Try again.");
			}

		}

	}
}
