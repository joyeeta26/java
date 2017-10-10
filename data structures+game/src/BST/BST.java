package BST;

import java.util.LinkedList;
import java.util.Scanner;

public class BST {

	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;

		}

	}

	private int size;
	private Node root;

	public BST() {
		this.size = 0;
		this.root = null;
	}

	public BST(int sa[]) {
		this.root = bstconstruct(sa, 0, sa.length - 1);
	}

	private Node bstconstruct(int sa[], int low, int high) {
		if (low > high) {
			return null;
		}

		int mid = (low + high) / 2;
		Node rv = new Node(sa[mid], null, null);
		rv.left = bstconstruct(sa, low, mid - 1);
		rv.right = bstconstruct(sa, mid + 1, high);
		return rv;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		if (node.left != null && node.right != null) {
			System.out.println(node.left.data + "->" + node.data + "<-" + node.right.data);
			display(node.left);
			display(node.right);
		}

		else if (node.left != null) {
			System.out.println(node.left.data + "->" + node.data + "<- END");
			display(node.left);
		} else if (node.right != null) {
			System.out.println("END->" + node.data + "<-" + node.right.data);

			display(node.right);
		} else {
			System.out.println("END->" + node.data + "<-END");
		}

	}

	private class composite {
		int size = 0;
		int height = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		boolean find = false;
		int summax = 0;

		public String toString() {
			String rv = " ";

			rv = rv + "size=" + this.size;
			rv = rv + "  height=" + this.height;
			rv = rv + "  max=" + this.max;
			rv = rv + "  min=" + this.min;
			rv = rv + "find=" + this.find;
			return rv;

		}

	}

	public void multisolver(int data) {
		composite com = new composite();
		multisolver(com, this.root, 0, data);
		System.out.println(com);
	}

	private void multisolver(composite com, Node node, int depth, int data) {
		if (node == null) {
			return;
		}

		com.size++;
		if (node.data > com.max) {
			com.max = node.data;
		}
		if (node.data < com.min) {
			com.min = node.data;
		}
		if (node.data == data) {
			com.find = true;
		}
		if (depth > com.height) {
			com.height = depth;
		}
		if (node.data == data) {
			com.find = true;
		}
		multisolver(com, node.left, depth + 1, data);
		multisolver(com, node.right, depth + 1, data);

	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		return Math.max(lh, rh) + 1;
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {
		if (node == null) {
			return;
		}

		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data);

	}

	public void levelorder() {
		levelorder(this.root);
	}

	private void levelorder(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while (queue.size() != 0) {
			Node temp = queue.removeFirst();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				queue.addLast(temp.left);
			}
			if (temp.right != null) {
				queue.addLast(temp.right);
			}

		}
	}

	public void preorderI() {
		preorderI(this.root);
	}

	private void preorderI(Node node) {
		LinkedList<Node> list = new LinkedList<>();
		list.add(this.root);
		while (list.size() != 0) {
			Node temp = list.removeFirst();
			System.out.print(temp.data + " ");

			if (temp.right != null) {
				list.addFirst(temp.right);
			}
			if (temp.left != null) {
				list.addFirst(temp.left);
			}
		}
	}

	public void inorder() {
		inorder(this.root);
	}

	private void inorder(Node node) {
		if (node == null) {
			return;
		}

		inorder(node.left);

		System.out.println(node.data);
		inorder(node.right);

	}

	public boolean find(int data) {
		return find(this.root, data);
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		if (node.data == data) {
			return true;
		} else if (data < node.data) {
			return find(node.left, data);
		} else {
			return find(node.right, data);
		}

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		} else {
			return max(node.right);
		}
	}

	public int min() {
		return min(this.root);
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		} else {
			return min(node.left);
		}
	}

	public void add(int data) {
		if (size == 0) {
			this.root = new Node(data, null, null);
			this.size++;

		} else {
			add(this.root, data);
		}
	}

	private void add(Node node, int data) {
		if (data < node.data) {
			if (node.left != null) {
				add(node.left, data);
			} else {
				node.left = new Node(data, null, null);
				this.size++;
			}
		}

		else if (data > node.data) {
			if (node.right != null) {
				add(node.right, data);
			} else {
				node.right = new Node(data, null, null);
				this.size++;
			}

		}

	}

	public void remove(int data) {
		if (size == 1) {
			if (this.root.data == data) {
				this.root = null;
				this.size = 0;
			}

		} else {
			remove(this.root, null, data, false);
		}
	}

	private void remove(Node node, Node parent, int data, boolean ilc) {

		if (data < node.data) {
			remove(node.left, node, data, true);
		} else if (data > node.data) {
			remove(node.right, node, data, false);
		} else {
			if (node.left != null && node.right != null) {
				int item = max(node.left);
				node.data = item;
				remove(node.left, node, item, true);
			}

			else {

				Node n2a = null;
				if (node.left != null) {
					n2a = node.left;
				} else {
					n2a = node.right;
				}
				if (ilc) {
					parent.left = n2a;
					this.size--;
				} else {
					parent.right = n2a;
					this.size--;
				}
			}

		}

	}

	public void printinrange(int min, int max) {
		printinrange(this.root, min, max);
	}

	private void printinrange(Node node, int min, int max) {
		if (node == null) {
			return;
		}

		if (node.data < min)

		{
			printinrange(node.right, min, max);
		} else if (node.data > max) {
			printinrange(node.left, min, max);
		} else {
			System.out.println(node.data);
			printinrange(node.right, min, max);
			printinrange(node.left, min, max);
		}
	}

	public void replcebysum() {

		composite com = new composite();
		replcebysum(com, this.root);
	}

	private void replcebysum(composite com, Node node) {
		if (node == null) {
			return;
		}

		replcebysum(com, node.right);
		int temp = node.data;
		node.data = com.summax;
		com.summax = com.summax + temp;

		// System.out.println(node.data);
		replcebysum(com, node.left);

	}

	public void replcebysummax() {
		replcebysummax(this.root, 0);
	}

	private int replcebysummax(Node node, int sol) {
		if (node == null) {

			return sol;
		}
		
		sol = replcebysummax(node.right, sol);
		int temp = node.data;
		node.data = sol;
		sol = sol + temp;
   
		sol = replcebysummax(node.left, sol);

		return sol;

	}

	private class DaiPair {
		int daimeter;
		int height;
	}

	public int daimeter2() {
		DaiPair dp = new DaiPair();
		dp = daimeter2(this.root);
		return dp.daimeter;
	}

	private DaiPair daimeter2(Node node) {
		if (node == null) {
			DaiPair bp = new DaiPair();
			bp.height = -1;
			bp.daimeter = 0;
			return bp;
		}

		DaiPair lp = daimeter2(node.left);
		DaiPair rp = daimeter2(node.right);
		DaiPair mp = new DaiPair();
		int f1 = lp.height + rp.height + 2;
		int f2 = lp.daimeter;
		int f3 = rp.daimeter;
		mp.height = Math.max(lp.height, rp.height) + 1;
		mp.daimeter = Math.max(f1, Math.max(f2, f3));
		return mp;
	}

	public int daimeter() {
		return daimeter(this.root);
	}

	private int daimeter(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = this.height(node.left);
		int rh = this.height(node.right);
		int dl = daimeter(node.left);
		int rd = daimeter(node.right);
		int f1 = dl;
		int f2 = rd;
		int f3 = lh + rh + 2;
		return Math.max(f1, Math.max(f2, f3));

	}

	private class balanced {
		boolean isbalanced;
		int heights;
	}
	// public boolean Isbalanced{
	// Isbalanced(this.root);
	// }

	private balanced Isbalanced(Node node) {
		if (node == null) {
			balanced rbalance = new balanced();
			rbalance.heights = -1;
			rbalance.isbalanced = true;
			return rbalance;
		}

		balanced left = Isbalanced(node.left);
		balanced right = Isbalanced(node.right);
		balanced mybalance = new balanced();
		mybalance.heights = Math.max(left.heights, right.heights) + 1;
		if (Math.abs(left.heights - right.heights) <= 1 && left.isbalanced == true && right.isbalanced == true) {
			mybalance.isbalanced = true;
		} else {
			mybalance.isbalanced = false;
		}

		return mybalance;
	}

}
