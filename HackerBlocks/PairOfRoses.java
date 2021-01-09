package HackerBlocks;

import java.util.Scanner;

public class PairOfRoses {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		while (n > 0) {
			int[] arr = takeinput();
			int[] arr1 = new int[2];
			BubbleSort(arr);
			int sum = in.nextInt();
			int diff = Integer.MAX_VALUE;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == sum) {
						if ((arr[j] - arr[i]) < diff) {
							diff = arr[j] - arr[i];
							arr1[0] = arr[i];
							arr1[1] = arr[j];
						}

					}

				}
			}

			System.out.println("Deepak should buy roses whose prices are " + arr1[0] +" and " + arr1[1]+".");
			System.out.println();
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

	public static void BubbleSort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - counter - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

	}

}
