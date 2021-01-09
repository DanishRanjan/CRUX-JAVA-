package HackerBlocks;

import java.util.Scanner;

public class StringDifference_in_ASCII_code {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String arr = ""+str.charAt(0);
		for(int i =0 ; i<str.length()-1 ; i++) {
			int diff = str.charAt(i+1)-str.charAt(i);
			arr=arr+diff+str.charAt(i+1);
		}
		System.out.println(arr);

	}
}
