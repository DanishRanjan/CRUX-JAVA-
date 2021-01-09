package HackerBlocks;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int n = in.nextInt();
		long[] arr = new long[n];
		for(int i = 0 ; i<n ; i++) {
			arr[i]=in.nextInt();
		}
		long maxArea = Integer.MIN_VALUE; 
		long PresArea = 0;
		int i = 0 ;
		while(i<arr.length) {
			if(stack.isEmpty() || arr[stack.peek()]<arr[i]) {
				stack.push(i);
				i++;
			}else {
				long x = arr[stack.pop()];
				int right = i;
				if(stack.isEmpty()) {
					PresArea = right * x;
				}else {
					int left = stack.peek();
					PresArea = (right-left-1)*x;
				}
				if(PresArea>maxArea) {
					maxArea = PresArea;
				}
				
			}
		}
		while(!stack.isEmpty()) {
			long x = arr[stack.pop()];
			int right = i;
			if(stack.isEmpty()) {
				PresArea = right * x;
			}else {
				int left = stack.peek();
				PresArea = (right-left-1)*x;
			}
			if(PresArea>maxArea) {
				maxArea = PresArea;
			}
			
		}
		System.out.println(maxArea);

	}

}
