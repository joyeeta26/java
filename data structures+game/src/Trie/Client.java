package Trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import javax.management.ListenerNotFoundException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TRIE trie = new TRIE();
		// trie.addword("art");
		// trie.addword("arts");
		// trie.addword("and");
		// System.out.println(trie.searchword("arts"));
		// System.out.println(trie.searchword("and"));
		// System.out.println(trie.searchword("art"));
		// System.out.println(trie.searchword("artvs"));
		//
		// trie.removeword("arts");
		// System.out.println(trie.searchword("arts"));
		// trie.display();
		// trie.displayword();
		 Integer arr[] = { 2, 3, 4, 6, 7 };
		// ArrayList<Integer> rv = getslargestelements(arr, 4);
		// System.out.println(rv);
		 System.out.println(getssmallestelements(arr,3));
		ArrayList<Integer> list0 = new ArrayList<>(Arrays.asList(2, 5, 8, 45, 78));
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(23, 56, 78));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 10));
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(67, 95));
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>(Arrays.asList(list0, list1, list2, list3));
		System.out.println(mergeKsortedlists(lists));

	}

	public static ArrayList<Integer> getslargestelements(Integer arr[], Integer k) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (Integer i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (Integer j = k; j < arr.length; j++) {
			Integer t = pq.peek();
			if (arr[j] > t) {
				pq.remove();
				pq.add(arr[j]);
			}
		}
		ArrayList<Integer> rv = new ArrayList<>();
		while (pq.size() != 0) {
			rv.add(pq.remove());
		}
		return rv;

	}

	public static ArrayList<Integer> getssmallestelements(Integer arr[], Integer k) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		for (Integer i = 0; i < k; i++) {
			pq.add(-1 * arr[i]);
		}
		for (Integer j = k; j < arr.length; j++) {
			Integer t = pq.peek();
			if (-1 * arr[j] > t) {
				pq.remove();
				pq.add(-1 * arr[j]);
			}
		}
		ArrayList<Integer> rv = new ArrayList<>();
		while (pq.size() != 0) {
			rv.add((-1) * pq.remove());
		}
		return rv;

	}

	public static ArrayList<Integer> mergeKsortedlists(ArrayList<ArrayList<Integer>> lists) {
		ArrayList<Integer> rv = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>();

		for (int i = 0; i < lists.size(); i++) {
			Pair p1 = new Pair(); //
			p1.Listno = i;
			p1.Itemno = 0;
			p1.data = lists.get(i).get(0);
			pq.add(p1);
		}
		while (pq.size() != 0) {
			Pair rp = pq.remove();
			rv.add(rp.data);
			if (rp.Itemno == lists.get(rp.Listno).size() - 1) { // if rp is a
																// pair which
																// represents
																// the end
																// element of a
																// list
			} else {
				rp.Itemno++;
				rp.data = lists.get(rp.Listno).get(rp.Itemno);
				pq.add(rp);
			}

		}
		return rv;
	}

	private static class Pair implements Comparable<Pair> {
		Integer data;
		Integer Listno;
		Integer Itemno;

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.data - o.data;
		}

	}

}
