package HackerBlocks;

import java.util.Scanner;

public class CreateTreePreOrderandInorder {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		CreateTreePreOrderandInorder m = new CreateTreePreOrderandInorder();
		int[] pre = takeInput();
		int[] in = takeInput();
		BinaryTree bt = m.new BinaryTree(pre, in);
		bt.display();
	}

	public static int[] takeInput() {
		int n = scn.nextInt();

		int[] rv = new int[n];
		for (int i = 0; i < rv.length; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree(int[] pre, int[] in) {
			this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
		}

		private Node construct(int[] pre, int prelo, int prehi, int[] in, int inlo, int inhi) {

			if (prelo > prehi || inlo > inhi) {
				return null;
			}
			Node nn = new Node();
			nn.data = pre[prelo];
			int x = -1;
			for (int i = inlo; i <= inhi; i++) {
				if (in[i] == nn.data) {
					x = i;
				}
			}
			int nel = x - inlo;
			nn.left = construct(pre, prelo + 1, prelo + nel, in, inlo, x - 1);
			nn.right = construct(pre, prelo + nel + 1, prehi, in, x + 1, inhi);
			return nn;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node == null) {
				return;
			}

			String str = "";

			if (node.left != null) {
				str += node.left.data;
			} else {
				str += "END";
			}

			str += " => " + node.data + " <= ";

			if (node.right != null) {
				str += node.right.data;
			} else {
				str += "END";
			}

			System.out.println(str);

			this.display(node.left);
			this.display(node.right);
		}

	}

}
