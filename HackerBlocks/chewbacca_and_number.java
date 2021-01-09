package HackerBlocks;

import java.util.Scanner;

public class chewbacca_and_number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long piggy = 0;
		long count = 0;
		while (n != 0) {
			long x = n % 10;
			if (n/10==0) {
				if ((9 - x) == 0) {
					n = n / 10;
					piggy += (x * (long) Math.pow(10, count));
					count++;
				} else {
					if (x > (9 - x)) {
						x = (9 - x);
					}
					n = n / 10;
					piggy += (x * (long) Math.pow(10, count));
					count++;
				}

			} else {
				if (x > (9 - x)) {
					x = (9 - x);
				}
				n = n / 10;
				piggy += (x * (long) Math.pow(10, count));
				count++;

			}
		}
		System.out.println(piggy);

	}
}
