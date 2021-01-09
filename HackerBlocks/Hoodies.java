package HackerBlocks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hoodies {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Queue<Integer>> course = new ArrayList<Queue<Integer>>();
		for(int i = 0 ; i<5 ; i++) {
			course.add(new LinkedList<Integer>());
		}
		ArrayList<Integer> order = new ArrayList<Integer>();
		int n = in.nextInt();
		while(n>0) {
			char ch = in.next().charAt(0);
			if(ch=='E') {
				int c = in.nextInt();
				int rollno = in.nextInt();
				course.get(c).add(rollno);
				if(!order.contains(c)) {
					order.add(c);
				}
			}else {
				System.out.println(order.get(0)+" "+course.get(order.get(0)).remove());
				if(course.get(order.get(0)).isEmpty()) {
					order.remove(0);
				}
			}
			n--;
		}

	}

}
