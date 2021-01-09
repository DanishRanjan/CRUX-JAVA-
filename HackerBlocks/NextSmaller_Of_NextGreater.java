package HackerBlocks;

import java.util.Scanner;

public class NextSmaller_Of_NextGreater {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		while (n > 0)
		{
			int[] arr = takeinput();
			int[] ans = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				int pos = bigger(arr, i);
				if (pos != -1) {
					int an = smaller(arr, pos);
					if (an != -1) {
						ans[i] = arr[an];
					} else {
						ans[i] = -1;
					}
				} else {
					ans[i] = -1;
				}

			}
			display(ans);
			n--;

		}
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static int bigger(int[] arr, int pos) {
		for (int i = pos + 1; i < arr.length; i++) {
			if (arr[pos] < arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int smaller(int[] arr, int pos) {
		for (int i = pos + 1; i < arr.length; i++) {
			if (arr[pos] > arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int[] takeinput() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}
}
