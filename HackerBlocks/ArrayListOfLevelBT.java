package HackerBlocks;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class ArrayListOfLevelBT {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayListOfLevelBT m = new ArrayListOfLevelBT();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {
			ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
			LinkedList<Node> primary = new LinkedList<>();
			LinkedList<Node> secondry = new LinkedList<>();
			primary.add(root);
			ArrayList<Integer> narr = new ArrayList<Integer>();
			while (primary.size() != 0) {
				Node rn = primary.removeFirst();
				narr.add(rn.data);
				if(rn.left!=null) {
				secondry.addLast(rn.left);
				}
				if(rn.right!=null) {
				secondry.addLast(rn.right);
				}
				if (primary.size() == 0) {
					arr.add(narr);
					primary = secondry;
					secondry = new LinkedList<>();
					narr = new ArrayList<Integer>();
				}
			}
			return arr;

		}

	}

}
