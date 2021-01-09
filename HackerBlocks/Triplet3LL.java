package HackerBlocks;

import java.util.*;

public class Triplet3LL {
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

	public Triplet3LL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public Triplet3LL(Node head, Node tail, int size) {
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
		if (parent == null) {
			return;
		}
		if (parent.data < child.data) {
			parent.data = child.data;
			parent.next = child.next;
		}

	}

	public void triplet(Triplet3LL n1, Triplet3LL n2, int n) {
		triplet(this.head, n1.head, n2.head, n,n1,n2);
	}

	static int count = 0;

	private void triplet(Node n1, Node n2, Node n3, int n,Triplet3LL l, Triplet3LL m) {
		if (n1 == null) {
			return;
		}
		if (n2 == null || n3 == null) {
			triplet(n1.next,l.head,m.head, n,l,m);
		}
		if (n1 == null || n2 == null || n3 == null) {
			return;
		}
		if ((n1.data + n2.data + n3.data) == n) {
			System.out.println(n1.data + " " + n2.data + " " + n3.data);
			return;
		} else if ((n1.data + n2.data + n3.data) < n) {
			triplet(n1, n2.next, n3, n,l,m);
		} else if ((n1.data + n2.data + n3.data) > n) {
			triplet(n1, n2, n3.next, n,l,m);
		}

	}

	private class max {
		int max = Integer.MIN_VALUE;
	}

	public void StrongestFighter(int k) {
		Node first = this.head;
		Node last = this.head;
		for (int i = 0; i < k - 1; i++) {
			last = last.next;
		}
		while (last != null) {
			max m = StrongestFighter(first, last, new max());
			System.out.print(m.max + " ");
			first = first.next;
			last = last.next;
		}
		System.out.println();
	}

	private max StrongestFighter(Node first, Node last, max max) {
		if (first == last) {
			max bc = new max();
			if (last.data > max.max) {
				bc.max = last.data;
			} else {
				bc.max = max.max;
			}
			return bc;
		}
		if (first.data > max.max) {
			max.max = first.data;
		}
		max cc = StrongestFighter(first.next, last, max);
		return cc;
	}

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		Triplet3LL ln = new Triplet3LL();
		Triplet3LL lm = new Triplet3LL();
		Triplet3LL lk = new Triplet3LL();
		for (int i = 0; i < n; i++) {
			ln.addLast(in.nextInt());
		}
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			arr1.add(in.nextInt());
		}
		for (int i = 0; i < k; i++) {
			arr2.add(in.nextInt());
		}
		Collections.sort(arr1);
		Collections.sort(arr2);
		Collections.reverse(arr2);
		for (int i = 0; i < m; i++) {
			lm.addLast(arr1.get(i));
		}
		for (int i = 0; i < k; i++) {
			lk.addLast(arr2.get(i));
		}
		int sum = in.nextInt();
		ln.triplet(lm, lk, sum);
	}
}
