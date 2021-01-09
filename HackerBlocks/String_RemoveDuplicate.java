package HackerBlocks;

import java.util.Scanner;

public class String_RemoveDuplicate {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(elements(str));
	}
	public static String elements(String str) {
		String arr = ""+str.charAt(0);
		int count =0;
		int piggy = str.charAt(0);
		for(int i = 0; i <str.length();i++) {
			if(str.charAt(i)!=piggy) {
				arr=arr+str.charAt(i);
				piggy = str.charAt(i);
			}
					
			
		}
		return arr;
	}
}
