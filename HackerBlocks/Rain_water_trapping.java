package HackerBlocks;

import java.util.Scanner;

public class Rain_water_trapping {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		while (n > 0) {
			int[] arr = takeinput();
			sum(arr);
			n--;
		}

	}

	public static int[] takeinput() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}
	public static void sum(int[] arr) {

			int[] left = new int[arr.length];

			left[0] = arr[0];
			for (int i = 1; i < left.length; i++) {
				left[i] = Math.max(left[i - 1], arr[i]);
			}

			int[] right = new int[arr.length];

			right[right.length - 1] = arr[arr.length - 1];
			for (int i = right.length - 2; i >= 0; i--) {
				right[i] = Math.max(right[i + 1], arr[i]);
			}

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {

				sum += Math.min(left[i], right[i]) - arr[i];
			}

			System.out.println(sum);

		}
}
