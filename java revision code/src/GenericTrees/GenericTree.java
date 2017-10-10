package GenericTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {

	private class Node {
		int data;
		ArrayList<Node> children;

		public Node(int data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
	}

	private Node root;
	private int size;

	public GenericTree() {
		Scanner scn = new Scanner(System.in);
		this.size = 0;
		this.root = takeinput(scn, null, 0);

	}

	private Node takeinput(Scanner scn, Node parent, int ithchild) {
		if (parent == null) {
			System.out.println(" enter root data");
		} else {
			System.out.println("enter " + ithchild + "th child of" + parent.data);
		}
		int childdata = scn.nextInt();
		Node child = new Node(childdata);
		this.size++;
		System.out.println("enter no. of children of " + child.data);
		int numgrandchld = scn.nextInt();

		for (int i = 0; i < numgrandchld; i++) {
			Node grandchild = takeinput(scn, child, i);
			child.children.add(grandchild);
		}
		return child;
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

		String str = node.data + "<=";
		for (Node child : node.children) {
			str = str + child.data + ",";
		}
		System.out.println(str);
		for (Node child : node.children) {
			display(child);
		}
	}

	public int size2() {
		return size2(this.root);
	}

	private int size2(Node node) {
		int rv = 0;
		for (Node child : node.children) {
			rv = rv + size2(child);
		}
		rv = rv + 1;
		return rv;
	}

	public int height() {
		return height(this.root);
	}

	private int height(Node node) {
		int maxht = -1;
		for (Node child : node.children) {
			int rv = height(child);
			if (rv > maxht) {
				maxht = rv;
			}
		}
		return maxht + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(Node node) {
		int max = node.data;
		for (Node child : node.children) {
			int rv = max(child);
			if (rv > max) {
				max = rv;
			}
		}
		return max;
	}

	public boolean ispresent(int data) {
		return ispresent(this.root, data);
	}

	private boolean ispresent(Node node, int data) {
	
		if (node.data == data) {
			return true;
		} else {
			for (Node child : node.children) {
				if (ispresent(child, data)) {
				
					return true;
				}
			}

		}
		return false;
	}
	public void preorder()
	{
		preorder(this.root);
	}
	private void preorder(Node node)
	{
		System.out.print(node.data+" ");
		for(Node child:node.children){
		preorder(child);
	}
	}
	public void postorder()
	{
		postorder(this.root);
	}
	private void postorder(Node node)
	{
		for(Node child:node.children){
		postorder(child);
	}
		System.out.print(node.data+" ");
  
	}
	
	public void levelorder(){
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(this.root);
		while(queue.size()!=0)
		{    Node node=queue.getFirst();
			System.out.print(node.data+" ");
			queue.removeFirst();
			for(Node child:node.children)
			{
				queue.addLast(child);
			}
		}
	}
	public void  preorderI()
	{
		 LinkedList<Node> stack = new LinkedList<>();
		 stack.addLast(this.root);
		 while(stack.size()!=0)
		 { Node node =stack.removeLast();
		   System.out.print(node.data+" ");
		   for(int i=node.children.size()-1;i>=0;i--)
		   {
			   Node child=node.children.get(i);
			   stack.addLast(child);
		   }
		 }
	}
}
