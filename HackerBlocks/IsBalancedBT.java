package HackerBlocks;

import java.util.Scanner;

public class IsBalancedBT {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		IsBalancedBT m = new IsBalancedBT();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public int ht() {
			return ht(root);
		}

		private int ht(Node root) {
			if (root == null) {
				return -1;
			}
			int left = ht(root.left);
			int right = ht(root.right);

			return Math.max(left, right) + 1;
		}

		public boolean isBalanced() {
			return this.isBalanced(this.root);
		}

		private boolean isBalanced(Node node) {
			if (node == null) {
				return true;
			}
			boolean lb = isBalanced(node.left);
			boolean rb = isBalanced(node.right);
			if (lb && rb) {
				int n = ht(node.left) - ht(node.right);
				if (n == 0 || n == 1 || n == -1) {
					return true;
				}
			}

			return false;

		}

		private class BalancedPair {
			int height;
			boolean isBalanced;
		}

	}
}
