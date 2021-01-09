package HackerBlocks;

import java.util.Scanner;

public class calculatetheSUM {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		int n = in.nextInt();
		while (n != 0) {
			int n1 = in.nextInt();
			arr = change(arr, n1);
			n--;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum = sum %(int)(Math.pow(10, 9)+ 7);
		System.out.println(sum);

	}

	public static int[] takeinput() {
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;

	}

	public static int[] change(int[] arr, int piggy) {
		piggy=piggy%(arr.length-1);
		int[] arr1 = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			int p = 0;
			if ((i - piggy) < 0) {
				p = arr.length + (i - piggy);

			} else {
				p = i - piggy;
			}

			arr1[i] = arr[i] + arr[p];
		}
		return arr1;
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val);
			System.out.print(" ");
		}
		System.out.println();
	}
}
