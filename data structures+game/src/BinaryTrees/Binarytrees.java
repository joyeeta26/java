package BinaryTrees;


import java.util.LinkedList;
import java.util.Scanner;



//import trees.Binarytrees.Node;
//import trees.Binarytrees.composite;

public class Binarytrees {

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

	public Binarytrees() {
		Scanner scn = new Scanner(System.in);
		this.root = takeinput(scn, null, false);
	}

	public Node takeinput(Scanner scn, Node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("enter data for the root");
		} else if (ilc) {
			System.out.println("enter data for left child");

		} else {
			System.out.println("enter data for right child");

		}

		int childD = scn.nextInt();
		Node rv = new Node(childD, null, null);
		this.size++;

		System.out.println("do we have left child");
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			rv.left = takeinput(scn, rv, true);
		}

		System.out.println("do we have right child");
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			rv.right = takeinput(scn, rv, false);
		}
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

	// public Binarytrees(int[] pre, int[] in) {
	// this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	// }
	//
	// private Node construct(int[] pre, int psi, int pei, int[] in, int isi,
	// int iei) {
	//
	//
	// if (psi > pei) {
	// return null;
	// }
	// this.size++;
	// Node rv = new Node(pre[psi], null, null);
	// int c = pre[psi];
	// int found = findindex(in, c);
	// int count = found-isi;
	//
	// rv.left = construct(pre, psi+1 , psi + count, in, isi, found-1);
	// rv.right = construct(pre, psi + 1 + count, pei, in, found+ 1, iei);
	// return rv;
	// }
	//
	public int findindex(int arr[], int find) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) {
				return i;
			}

		}
		return 0;
	}

	// public Binarytrees(int[] post, int[] in) {
	// this.root = construct(post, 0, post.length - 1, in, 0, in.length - 1);
	// }
	//
	// private Node construct(int[] post, int psi, int pei, int[] in, int isi,
	// int iei) {
	//
	// if (psi > pei || isi > iei) {
	// return null;
	// }
	// this.size++;
	// Node rv = new Node(post[pei], null, null);
	// int c = post[pei];
	// int found = findindex(in, c);
	// int count = found - isi;
	//
	// rv.left = construct(post, psi, psi + count - 1, in, isi, found - 1);
	// rv.right = construct(post, psi + count, pei - 1, in, found + 1, iei);
	//
	// return rv;
	// }
	// public Binarytrees(int[] pre, int[] post) {
	// this.root = construct(pre, 0, pre.length - 1, post, 0, post.length - 1);
	// }

	private Node construct(int[] pre, int psi, int pei, int[] post, int posi, int poei) {
		if (psi > pei) {
			return null;
		}
		this.size++;
		Node rv = new Node(pre[psi + 1], null, null);
		int c = post[pei];
		int found = findindex(post, c);
		int count = found - posi;
		rv.left = construct(pre, psi + 1, psi + count, post, posi, found);
		rv.right = construct(pre, psi + count + 1, pei, post, found + 1, poei);

		return rv;
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

	private class bst {
		int min;
		int max;
		boolean isbst;
	}

	private bst isBst(Node node) {
		if (node == null) {
			bst rbst = new bst();
			rbst.max = Integer.MIN_VALUE;
			rbst.min = Integer.MAX_VALUE;
			rbst.isbst = true;
		}

		bst left = isBst(node.left);
		bst right = isBst(node.right);
		bst mybst = new bst();
		mybst.max = Math.max(node.data, Math.max(left.max, right.max));
		mybst.min = Math.min(node.data, Math.min(left.min, right.min));

		if (node.data > left.max && node.data < right.max && left.isbst == true && right.isbst == true) {
			mybst.isbst = true;
		} else {
			mybst.isbst = true;
		}

		return mybst;

	}

	public boolean bstTD() {
		return IsBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	private boolean IsBST(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		if (node.data > max || node.data < min) {
			return false;
		} else {
			boolean b = IsBST(node.left, min, node.data);
			b = IsBST(node.right, node.data, max);
			return b;
		}
	}

	public void printpath(int target) {
		printpath(this.root, "", 0, target);
	}

	private void printpath(Node node, String psf, int sum, int target) {
		if (node == null) {
			return;
		}
		if (node.right == null && node.left == null) {
			if (sum+node.data == target) {
				psf=psf+node.data;
				System.out.println(psf);
			}
			return;
		}

		printpath(node.left, psf + node.data, sum + node.data, target);
		printpath(node.right, psf + node.data, sum + node.data, target);

	}
}
