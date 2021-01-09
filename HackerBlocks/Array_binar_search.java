package HackerBlocks;

import java.util.Scanner;

public class Array_binar_search {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		int n = in.nextInt();
		System.out.println(BinarySearch(arr,n));
	}

	public static int[] takeinput() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}
	public static int BinarySearch(int[] arr, int n) {
		int l = 0;
		int h = arr.length-1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == n) {
				return mid;
			}
			if (n < arr[mid]) {
				h = mid - 1;
			}
			if (n > arr[mid]) {
				l = mid + 1;
			}
		}
		return -1;
	}
}
