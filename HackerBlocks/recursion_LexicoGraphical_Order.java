package HackerBlocks;

import java.util.Scanner;

public class recursion_LexicoGraphical_Order {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LexicoCounting(0, n);

	}

	public static void LexicoCounting(int curr, int end) {
		if (curr == end) {
		    System.out.print(curr+" ");
			return;
		}
		if (curr > end) {
			return;
		}
		System.out.print(curr+" ");
		int i =0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			LexicoCounting(curr*10+i, end);
		}
	}
}
