package HackerBlocks;

import java.util.Scanner;

public class Form_BiggestNumber {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int n = in.nextInt();
		while (n > 0) {
			int[] arr = takeinput();
			for(int count =0 ; count<arr.length ; count ++) {
				for(int i =0 ; i<arr.length-1 ; i++) {
					if(compare(arr[i],arr[i+1])) {
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
				}
			}
			display(arr);
			n--;

		}
	}
	public static boolean  compare(int i , int j) {
		String str1 = i+""+j;
		String str2 = j+""+i;
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		if(n1>n2) {
			return false;
		}else {
			return true;
		}
	}
	public static void display(int[] arr) {
		for(int val: arr) {
			System.out.print(val);
		}
		System.out.println();
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
