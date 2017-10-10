package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<>(); //

		}
	}

	private Node root;
	private int size;

	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		this.root = this.takeinput(scn, null, 0);
	}

	private Node takeinput(Scanner scn, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println(" enter root data");
		} else {
			System.out.println("enter " + ithchild + "thchild of" + parent.data);
		}

		int childdata = scn.nextInt();
		Node child = new Node(childdata);
		size++;

		System.out.println("enter no of children of " + child.data);
		int numgc = scn.nextInt();

		for (int i = 0; i < numgc; i++) {
			Node grandchild = takeinput(scn, child, i);
			child.children.add(grandchild);
		}
		return child;
	}

	public int size() {
		return this.size();
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void display() {
		display(root);

	}

	private void display(Node node) {
		String str = node.data + "<=";
		for (Node child : node.children) {
			str = str + child.data + ",";
		}
		str = str + "END";
		System.out.println(str);

		for (Node child : node.children) {
			this.display(child);
		}

	}

	public int size2() {
		return size2(this.root);

	}

	private int size2(Node node) {
		int rv = 0;

		for (Node child : node.children) {
			rv = size2(child) + rv;
		}
		rv = rv + 1;
		return rv;
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		int rv = 0;
		int maxcht = -1;
		for (Node child : node.children) {
			int cht = height(child);
			if (cht > maxcht) {
				maxcht = cht;
			}
		}

		rv = 1 + maxcht;
		return rv;

	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int rv = node.data;
		for (Node child : node.children) {
			int max = max(child);
			if (rv < max) {
				rv = max;
			}
		}
		return rv;

	}

	public boolean find(int data) {
		return find(this.root, data);

	}

	private boolean find(Node node, int data) {
		if (node.data == data) {
			return true;
		}
		for (Node child : node.children) {
			if (find(child, data) == true) {
				return true;
			}
		}
		return false;
	}

	public void preorder() {
		preorder(this.root);
	}

	private void preorder(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(Node node) {

		for (Node child : node.children) {
			postorder(child);
		}
		System.out.println(node.data);

	}

	public void levelorder() {
		levelsorder();
	}

	private void levelsorder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		while (queue.size() != 0) {
			Node temp = queue.removeFirst();
			System.out.print(temp.data + " ");
			for (Node child : temp.children) {
				queue.addLast(child);
			}
		}

	}

	public void preorderI() {
		preOrderI();
	}

	private void preOrderI() {
		LinkedList<Node> stack = new LinkedList<>();
		stack.addFirst(this.root);
		while (stack.size() != 0) {
			Node temp = stack.removeFirst();
			System.out.print(temp.data + " ");
			for (int i = temp.children.size() - 1; i >= 0; i--) {
				Node child = temp.children.get(i);

				stack.addFirst(child);
			}
		}

	}

	private class composite {
		int size = 0;
		int height = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		boolean found;
		Node justlarger = null;
		Node prev = null;
		Node curr = null;
		Node predeccessor = null;
		Node successor = null;

		public String toString() {
			String rv = " ";

			rv = rv + "size=" + this.size;
			rv = rv + "  height=" + this.height;
			rv = rv + "  max=" + this.max;
			rv = rv + "  min=" + this.min;
			rv = rv + "  found=" + this.found;
			if (justlarger == null) {
				rv = rv + " NULL";
			}

			else {
				rv = rv + "justlarger is" + justlarger.data;
			}
			rv = rv + "predeccessor is" + predeccessor.data;
			rv = rv + "successor is" + successor.data;
			return rv;

		}

	}

	public void multisolver(int data) {
		composite com = new composite();
		multisolver(com, this.root, 0, data);
		System.out.println(com);
	}

	private void multisolver(composite com, Node node, int depth, int data) {
		com.size++;

		if (data < node.data) {
			if (com.justlarger == null) {
				com.justlarger = node;
			} else {
				if (node.data < com.justlarger.data) {
					com.justlarger = node;
				}
			}
		}
		com.prev = com.curr;
		com.curr = node;
		if (com.curr.data == data) {
			com.predeccessor = com.prev;
		}
		if (com.prev.data == data) {
			com.successor = com.curr;
		}

		if (com.min > node.data) {
			com.min = node.data;
		}
		if (com.max < node.data) {
			com.max = node.data;
		}
		if (data == node.data) {
			com.found = true;
		}
		if (depth > com.height) {
			com.height = depth;
		}

		for (Node child : node.children) {
			multisolver(com, child, depth + 1, data);
		}

	}

	public int levelmax(int level) {
		return levelmax(this.root, level, 0);
	}

	private int levelmax(Node node, int level, int currl) {
		int b = Integer.MIN_VALUE;
		if (currl == level) {
			if (b < node.data)
				b = node.data;
			return b;
		}

		for (Node child : node.children) {
			b = levelmax(child, level, currl + 1);
		}
		return b;
	}

	public void levelordernextline() {
		levelsordernextline();
	}

	private void levelsordernextline() {
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		queue.add(this.root);
		while (queue.size() != 0) {

			Node temp = queue.removeFirst();
			System.out.print(temp.data + " ");
			for (Node child : temp.children) {
				helper.addLast(child);
			}
			if (queue.size() == 0) {
				System.out.println();
				queue = helper;
				helper = new LinkedList<>();
			}
		}

	}

	public void levelorderzz() {
		levelsorderzz();
	}

	private void levelsorderzz() {
		boolean flag = true;
		LinkedList<Node> queue = new LinkedList<>();
		LinkedList<Node> helper = new LinkedList<>();
		queue.add(this.root);
		while (queue.size() != 0) {

			Node temp = queue.removeFirst();
			System.out.print(temp.data + " ");

			if (flag) {
				for (Node child : temp.children) {

					helper.addFirst(child);
				}
			} else {

				for (int i = temp.children.size() - 1; i >= 0; i--) {
					Node child = temp.children.get(i);
					helper.addFirst(child);
				}
			}
			if (queue.size() == 0) {
				System.out.println();
				if (flag == true) {
					flag = false;
				} else {
					flag = true;
				}
				queue = helper;
				helper = new LinkedList<>();
			}
		}

	}

	public void linearize() {
		linearize(this.root);
	}

	private void linearize(Node node) {
		for (Node child : node.children) {
			linearize(child);
		}
		while (node.children.size() > 1) {
			Node temp = node.children.remove(1);
			Node tail = gettail(node.children.get(0));
			tail.children.add(temp);
		}

	}

	public void linearize2() {
		linearize(this.root);
	}

	private Node linearize2(Node node) { // as the first linearize was making
											// multiple calls for get tail

		if (node.children.size() == 0) {
			return node;
		}
		Node tail = linearize2(node.children.get(0));
		while (node.children.size() > 1) {
			Node remove = node.children.remove(1);
			Node removed = linearize2(remove);
			node.children.add(remove);
			tail = removed;
		}
		return tail;

	}

	private Node gettail(Node node) {
		Node rv = node;
		while (rv.children.size() != 0) {
			rv = rv.children.get(0);
		}
		return rv;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(Node node) {
		for (Node child : node.children) {
			mirror(child);
		}
		for (int li = 0, ri = node.children.size() - 1; li <= ri; li++, ri--) {
			Node temp = node.children.get(li);
			Node rv = node.children.get(ri);
			node.children.set(li, rv);
			node.children.set(ri, temp);

		}

	}

	public boolean isisomorphic(GenericTree other) {
		return isisomorphic(this.root, other.root);
	}

	private boolean isisomorphic(Node thisnode, Node other) {

		if (thisnode.children.size() != other.children.size()) {
			return false;
		}

		for (int i = 0; i < thisnode.children.size() - 1; i++) {
			boolean b = isisomorphic(thisnode.children.get(i), other.children.get(i));
			if (b == false) {
				return b;
			}
		}
		return true;
	}

	public int countleaforder() {
		return countleaforder(this.root);
	}

	private int countleaforder(Node node) {
		int rv = 0;
		if (node.children.size() == 0) {
			return 1;
		}
		for (Node child : node.children) {
			rv = countleaforder(child) + rv;
		}
		return rv;
	}

	public void printatlevel(int level) {
		printlevel(this.root, 0, level);
	}

	private void printlevel(Node node, int currl, int level) {

		if (currl == level) {
			System.out.println(node.data);
			return;
		}

		for (Node child : node.children) {
			printlevel(child, currl + 1, level);

		}

	}

}
