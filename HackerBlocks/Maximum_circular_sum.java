package HackerBlocks;

import java.util.Scanner;

public class Maximum_circular_sum {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		while (n > 0) {
			int[] arr = takeinput();
			int sum = 0;
			int max = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = arr[i];
				for (int j = 1; j < arr.length-1; j++) {
					int val = j+i;
					if(val>=arr.length) {
						val = val-arr.length;
					}
					
					sum += arr[val];
					if (sum > max) {
						max = sum;
					}
				}
				

			}
			System.out.println(max);
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

}
