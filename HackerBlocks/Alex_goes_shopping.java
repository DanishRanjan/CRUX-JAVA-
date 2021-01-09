package HackerBlocks;

import java.util.Scanner;

public class Alex_goes_shopping {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		int[] arr = takeinput(n);
		int x = in.nextInt();
		while (x > 0) {
			int rupess = in.nextInt();
			int total = in.nextInt();
			if (total <= noOfInput(arr, rupess)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			x--;
		}

	}

	public static int[] takeinput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}

	public static int noOfInput(int[] arr, int total) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= total) {
				if (total % arr[i] == 0) {
					x += 1;
				}
			}
		}
		return x;
	}
}
