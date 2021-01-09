package HackerBlocks;

import java.util.Scanner;
import java.util.Stack;

public class PrattekSirandCoding {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = in.nextInt();
		while(n>0) {
			int type = in.nextInt();
			if(type==2) {
				stack.push(in.nextInt());
			}else {
				if(stack.isEmpty()) {
					System.out.println("No Code");
				}else {
					System.out.println(stack.pop());
				}
			}
			n--;
		}

	}

}

