package HackerBlocks;

import java.util.Scanner;
import java.util.Arrays;
public class ChessBoard_Problem2_count_print {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] mp = makeMinesPorts(SOE(n * n));
		System.out.println("\n" + chess2(0, 0, n - 1, n - 1, "", mp));

	}

	public static int chess2(int cr, int cc, int er, int ec, String ans, int[] mp) {
		if (cr == er && cc == ec) {
			System.out.print(ans + "{" + er + "-" + ec + "} ");
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int c = 0;
		int val = cr * (ec + 1) + (cc + 1);
		if (mp[val] == 1) {
			return 0;
		} else if (mp[val] == 2) {
			c += chess2(er, ec, er, ec, ans + "{" + cr + "-" + cc + "}P", mp);
		}

		c += chess2(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K", mp);
		c += chess2(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K", mp);

		if (cr == 0 || cr == er || cc == 0 || cc == ec) {

			for (int move = 1; move <= ec; move++) {
				c += chess2(cr, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}R", mp);
			}

			for (int move = 1; move <= er; move++) {
				c += chess2(cr + move, cc, er, ec, ans + "{" + cr + "-" + cc + "}R", mp);
			}

		}

		if (cr == cc || cr + cc == ec) {
			for (int move = 1; move <= ec && move <= er; move++) {
				c += chess2(cr + move, cc + move, er, ec, ans + "{" + cr + "-" + cc + "}B", mp);
			}
		}
		return c;
	}

	public static boolean[] SOE(int n) {

		boolean[] primes = new boolean[n + 1];

		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

			if (primes[table] == false) {
				continue;
			}

			for (int multiplier = 2; table * multiplier <= n; multiplier++) {
				primes[table * multiplier] = false;
			}

		}

		return primes;

	}

	public static int[] makeMinesPorts(boolean[] primes) {

		int count = 1;

		int[] Port = new int[primes.length];

		for (int i = 0; i < primes.length; i++) {

			if (primes[i]) {

				if (count % 2 == 0) {
					Port[i] = 2;
				} else {
					Port[i] = 1;
				}

				count++;
			}

		}

		return Port;
	}
}
