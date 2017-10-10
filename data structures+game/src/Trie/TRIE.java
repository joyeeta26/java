package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class TRIE {

	private class Node {
		Character data;
		boolean eow;
		HashMap<Character, Node> children;

		public Node(Character data, Boolean eow) {
			this.data = data;
			this.eow = eow;
			this.children = new HashMap<>();
		}
	}

	Node root;
	int size;

	public TRIE() {
		this.root = new Node('\0', false);

		size = 1;
	}

	public void addword(String word) {
		addword(this.root, word);
	}

	private void addword(Node node, String word) {
		if (word.length() == 0) {
			node.eow = true;
			return;
		}

		Character ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			child = new Node(ch, false);
			node.children.put(ch, child);
			this.size++;
		}
		addword(child, ros);
	}

	public boolean searchword(String word) {
		return searchword(this.root, word);
	}

	private boolean searchword(Node node, String word) {
		if (word.length() == 0) {
			return node.eow;
		}

		Character ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			return false;

		}
		return searchword(child, ros);
	}

	public void removeword(String word) {
		removeword(this.root, word);
	}

	private void removeword(Node node, String word) {
		if (word.length() == 0) {
			return;
		}

		Character ch = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(ch);
		if (child == null) {
			return;

		}
		removeword(child, ros);
		if (child.eow == true && child.children.size() == 0) {
			node.children.remove(ch);
			this.size--;
		}
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		String str = node.data + "<=";
		Set<Character> set = node.children.keySet();
		for (Character c : set) {
			str = str + c + ",";
		}
		str = str + "END";
		System.out.println(str);

		for (Character c : set) {

			this.display(node.children.get(c));
		}
	}

	public void displayword() {
		displayword(this.root, "");
	}

	private void displayword(Node node, String osf) {
		if (node.eow) {
			System.out.println(osf);
		}
		Set<Character> set = node.children.keySet();
		for (Character ch : set) {
			Node child = node.children.get(ch);
			displayword(child, osf + ch);

		}
	}
	
	
	
	
	
	
	
	}
	
	


