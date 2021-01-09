package HackerBlocks;

import java.util.*;

public class LevelOrderNewLineBT {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		LevelOrderNewLineBT m = new LevelOrderNewLineBT();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {

			LinkedList<Node> primary = new LinkedList<>();
			LinkedList<Node> secondry = new LinkedList<>();
			primary.add(root);
			while (primary.size() != 0) {
				Node rn = primary.removeFirst();
				System.out.print(rn.data + " ");
				if (rn.left != null) {
					secondry.addLast(rn.left);
				}
				if (rn.right != null) {
					secondry.addLast(rn.right);
				}
				if (primary.size() == 0) {
					System.out.println();
					primary = secondry;
					secondry = new LinkedList<>();
				}
			}
		}

	}
}
