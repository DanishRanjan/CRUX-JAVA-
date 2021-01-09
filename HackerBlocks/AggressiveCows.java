package HackerBlocks;

import java.util.Arrays;
import java.util.Scanner;
public class AggressiveCows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nos = sc.nextInt();
		int noc = sc.nextInt();

		int[] stalls = new int[nos];

		for (int i = 0; i < stalls.length; i++) {
			stalls[i] = sc.nextInt();
		}

		Arrays.sort(stalls);

		int finalAns = 0;

		int lo = 0;
		int hi = stalls[stalls.length - 1] - stalls[0];

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(stalls, noc, mid)) {
				lo = mid + 1;
				finalAns = mid;
			} else {
				hi = mid - 1;
			}

		}

		System.out.println(finalAns);

	}

	public static boolean isItPossible(int[] stalls, int noc, int mid) {

		int cowsPlaced = 1;
		int pos = stalls[0];

		for (int i = 1; i < stalls.length; i++) {

			if (stalls[i] - pos >= mid) {
				cowsPlaced++;
				pos = stalls[i];

				if (cowsPlaced == noc) {
					return true;
				}
			}

		}

		return false;

	}

}