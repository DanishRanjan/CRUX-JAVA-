package HackerBlocks;
import java.util.Scanner;

class Stack {

	protected int[] data;
	protected int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int n) {
		this.data = new int[n];
		this.tos = -1;
	}

	public void push(int n) throws Exception {
		if (isFull()) {
			throw new Exception("Stack  is Full");
		}
		tos++;
		this.data[this.tos] = n;
//		System.out.println(tos);
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		int n = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return n;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Empty Stack");
		}
		int n = this.data[this.tos];
		return n;
	}

	public int size() {
		return (this.tos + 1);
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return this.size() == this.data.length;

	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.println(this.data[i]);
		}
	}

}

class DYanamic_stack extends Stack {
	@Override
	public void push(int n) throws Exception {
		if (isFull()) {

			int[] na = new int[2 * this.data.length];
			for (int i = 0; i <= this.tos; i++) {
				na[i] = this.data[i];
			}
			this.data = na;
		}
		super.push(n);
	}
}

class Stock_Span {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i< n ; i++) {
			arr[i] = in.nextInt();
		}
		int[] ans = new int[n];
		DYanamic_stack stack = new DYanamic_stack();
		for (int i = 0; i < ans.length; i++) {
			while (stack.isEmpty() == false && arr[i] > arr[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - stack.peek();
			}
			stack.push(i);
		}
		for (int val : ans) {
			System.out.print(val + " ");

		}
		System.out.println("END");
		System.out.println();
	}

}
