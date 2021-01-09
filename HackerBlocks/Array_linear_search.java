package HackerBlocks;

import java.util.Scanner;

public class Array_linear_search {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		int n = in.nextInt();
		System.out.println(search(arr,n));
	}

	public static int[] takeinput() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}
	public static int search(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
