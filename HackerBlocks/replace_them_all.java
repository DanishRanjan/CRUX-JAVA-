package HackerBlocks;

import java.util.Scanner;

public class replace_them_all {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n= in.nextLong();
		long piggy=0;
		long count=0;
		if(n==0) {
			System.out.println(5);
		}
		if(n!=0) {
		while(n!=0) {
			long div=n%10;
			if (div==0) {
				div=5;
			}
			n=n/10;
			piggy+=(div*(long)Math.pow(10, count));
			count++;
		}
		System.out.println(piggy);
		}

	}
}
