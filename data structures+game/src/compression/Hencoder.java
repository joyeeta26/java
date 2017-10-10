package compression;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public class Hencoder {
	private class Node implements Comparable<Node> {
		Character data;
		int cost;
		Node left;
		Node right;

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}
	}

	HashMap<Character, String> encoder = new HashMap<>();

	HashMap<String, Character> decoder = new HashMap<>();

	
	public Hencoder(String filler) {

		HashMap<Character, Integer> fm = new HashMap<>();

		for (int i = 0; i < filler.length(); i++) {
			Character ch = filler.charAt(i);
			if (fm.containsKey(ch)) {
				int ov = fm.get(ch);
				int nv = ov + 1;
				fm.put(ch, nv);

			}

			else {
				fm.put(ch, 1);
			}

		}

		PriorityQueue<Node> pq = new PriorityQueue<>();
		Set<Character> set = fm.keySet();
		for (Character a : set) {
			Node node = new Node();
			node.data = a;
			node.cost = fm.get(a);
			node.left = null;
			node.right = null;
			pq.add(node);
		}

		while (pq.size() != 1) {
			Node one = pq.remove();
			Node two = pq.remove();
			Node node = new Node();
			node.data = '\0';
			node.cost = one.cost + two.cost;
			node.left = one;
			node.right = two;
			pq.add(node);

		}
		Node finalnode = pq.remove();

		fillencoderdecoder(finalnode, "");
	}

	private void fillencoderdecoder(Node node, String osf) {
		if (node.left == null) {
			encoder.put(node.data, osf);
			decoder.put(osf, node.data);
			return;
		}

		fillencoderdecoder(node.left, osf + 0);
		fillencoderdecoder(node.right, osf + 1);
	}

	public String encode(String word) {
		String rv = "";
		for (int i = 0; i < word.length(); i++) {
			Character ch = word.charAt(i);
			rv = rv + encoder.get(ch);
		}
		return rv;
	}

	public String decode(String word) {
		String prefix = "";
		String rv = "";

		for (int i = 0; i < word.length(); i++) {
			prefix = prefix + word.charAt(i);
			if (decoder.containsKey(prefix)) {
				rv = rv + decoder.get(prefix);
				prefix = "";
			}
		}
		return rv;
	}

}
