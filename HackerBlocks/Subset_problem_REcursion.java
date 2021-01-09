package HackerBlocks;

import java.util.Scanner;

public class Subset_problem_REcursion {
	static int count= 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int t = scn.nextInt();
		sub(arr,0,0, "", t);
		System.out.println();
		System.out.println(count);
		

	}

	public static void sub(int[] arr, int vidx, int sum, String ans, int target) {

		if (vidx == arr.length) {
			if (sum == target) {
				System.out.print(ans+" ");
				count++;
			}

			return;
		}
		sub(arr, vidx + 1, sum + arr[vidx], ans + arr[vidx] + " ", target);
		sub(arr, vidx + 1, sum, ans, target);// no
		
	}
}
