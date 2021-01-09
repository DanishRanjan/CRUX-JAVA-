package HackerBlocks;

import java.util.Scanner;

public class DeleteNodeLL {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public DeleteNodeLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public DeleteNodeLL(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	// O(1)
	public int size() {
		return this.size;
	}

	// O(1)
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.tail.data;
	}

	// O(N)
	public int getAt(int idx) throws Exception {
		Node temp = this.getNodeAt(idx);
		return temp.data;
	}

	// O(N)
	private Node getNodeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		Node retVal = this.head;
		for (int i = 0; i < idx; i++) {
			retVal = retVal.next;
		}

		return retVal;
	}

	// O(1)
	public void addFirst(int data) {
		Node node = new Node(data, this.head);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.head = node;
		}

		this.size++;
	}

	// O(1)
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// O(n)
	public void addAt(int idx, int data) throws Exception {
		if (idx < 0 || idx > this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			this.addFirst(data);
		} else if (idx == this.size()) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;

			Node node = new Node(data, n);
			nm1.next = node;

			this.size++;
		}
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.head.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}

		this.size--;
		return retVal;
	}

	// O(n)
	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.tail.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node sm2 = this.getNodeAt(this.size() - 2);
			sm2.next = null;
			this.tail = sm2;
		}

		this.size--;
		return retVal;
	}

	// O(n)
	public int removeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size() - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			this.size--;

			return n.data;
		}
	}

	// O(n)
	public void display() {
		Node node = this.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		// System.out.println("END");
	}

	private class HeapMover {
		Node lo;
		int count = 0;
		boolean ans = true;
	}

	public boolean isPalindrome() {
		HeapMover mover = new HeapMover();
		mover.lo = this.head;
		return isPalindrome(mover, this.head).ans;

	}

	private HeapMover isPalindrome(HeapMover Mover, Node hi) {
		if (hi == null) {
			return Mover;
		}
		HeapMover nn = isPalindrome(Mover, hi.next);
		if (nn.count <= (this.size / 2) && nn.ans) {
			if (nn.lo.data == hi.data) {
			} else {
				nn.ans = false;
			}
		}
		nn.lo = nn.lo.next;
		nn.count++;
		return nn;
	}

	public void remove() {
		remove(null, this.head);
	}

	private void remove(Node parent, Node child) {
		if (child == null) {
			return;
		}
		remove(child, child.next);
		if(parent==null) {
			return;
		}
		if (parent.data < child.data) {
			parent.data = child.data;
			parent.next = child.next;
		}

	}

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int m = in.nextInt();
//		int k = in.nextInt();
		DeleteNodeLL ln = new DeleteNodeLL();
//		LinkedList lm = new LinkedList();
//		LinkedList lk = new LinkedList();
		for (int i = 0; i < n; i++) {
			ln.addLast(in.nextInt());
		}
//		for (int i = 0; i < m; i++) {
//			lm.addLast(in.nextInt());
//		}
//		for (int i = 0; i < k; i++) {
//			lk.addLast(in.nextInt());
//		}
		ln.remove();
		ln.display();
	}
}
