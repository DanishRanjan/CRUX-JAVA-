package HackerBlocks;

import java.util.Scanner;

public class Array_target_SumPair {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		int n = in.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (n == (arr[i] + arr[j])) {
					if (arr[i] < arr[j]) {
						System.out.println(arr[i] + " and " + arr[j]);
					} else {
						System.out.println(arr[j] + " and " + arr[i]);
					}
				}
			}
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

}
