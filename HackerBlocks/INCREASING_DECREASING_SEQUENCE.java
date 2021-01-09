package HackerBlocks;

import java.util.Scanner;

public class INCREASING_DECREASING_SEQUENCE {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		boolean x = inc();
		System.out.println(x);
	}

	public static boolean inc() {
		int n = in.nextInt();
		int pre = in.nextInt();
		boolean x = true;
		for (int i = 0; i < n - 1; i++) {
			int cur = in.nextInt();

			if (x) {
				if (cur < pre) {

				} else if(cur > pre){
					x = false;
				}else{
				    return false;
				}
			} else {
				if (cur <= pre) {
					return false;
				}
			}
			pre = cur;

		}
		return true;

	}
}
