package HackerBlocks;

import java.util.Scanner;

public class Array_max_value_in_array {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		System.out.println(max(arr));
	}

	public static int[] takeinput() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}
	public static int max(int[] arr) {
		int piggy = -1000000000;
		for (int val : arr) {
			if (val > piggy) {
				piggy = val;
			}
		}
		return piggy;
	}
}
