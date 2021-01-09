package HackerBlocks;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWith_cards_InStack {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		ArrayList<Stack<Integer>> a = new ArrayList<Stack<Integer>>();
		ArrayList<Stack<Integer>> b = new ArrayList<Stack<Integer>>();
		for(int i =0 ; i<=q ; i++) {
			a.add(new Stack<Integer>());
			b.add(new Stack<Integer>());
		}
		for(int i = 0 ; i<n ; i++) {
			a.get(0).push(in.nextInt());
		}
		for(int i = 1; i<=q ; i++) {
			while(a.get(i-1).size()!=0) {
				if(a.get(i-1).peek()%nthprime(i)==0) {
					b.get(i).push(a.get(i-1).pop());
				}else {
					a.get(i).push(a.get(i-1).pop());
				}
			}
		}
		for(int i = 0 ; i<=q ; i++) {
			while(!b.get(i).isEmpty()) {
				System.out.println(b.get(i).pop());
			}
		}
		while(!a.get(q).isEmpty()) {
			System.out.println(a.get(q).pop());
		}

	}
	public static int nthprime(int n) {
		int count = 0;
		int start = 2;
		while(true) {
			if(isprime(start)) {
				count++;
			}
			if(count==n) {
				return start;
			}
			start++;
		}
	}
	public static boolean isprime(int n) {
		int div = 2;
		while(div<=Math.sqrt(n)) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
