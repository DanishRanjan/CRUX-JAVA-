package HackerBlocks;

import java.util.Scanner;

public class pascalTriangle {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		arr[0] = 1;
		display(arr);
		for (int i = 1; i < arr.length; i++) {
			int count=i;
			while (count != 0) {
				arr[count]+=arr[count-1];
				count--;

			}
			
			display(arr);

		}

	}

	public static void display(int[] arr) {
		for (int val : arr) {
			if (val != 0) {
				System.out.print(val);
				System.out.print("\t");
			}
		}
		System.out.println();
	}
}
