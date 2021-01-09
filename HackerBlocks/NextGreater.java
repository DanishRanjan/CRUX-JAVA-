package HackerBlocks;
import java.util.Scanner;

public class NextGreater {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n > 0) {
			int len = in.nextInt();
			int[] arr = new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = in.nextInt();
			}
			int[] ans = nextgreater(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + "," + ans[i]);
			}
			n--;
		}

	}

	private static int[] nextgreater(int[] arr) throws Exception {
		int[] ans = new int[arr.length];
		DYanamic_stack st = new DYanamic_stack();
		for (int i = 0; i < arr.length; i++) {
			while (st.isEmpty() == false && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		while (st.isEmpty() != true) {
			ans[st.pop()] = -1;
		}

		return ans;
	}

}

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