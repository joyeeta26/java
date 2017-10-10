package hash;

import java.util.ArrayList;

public class hashmap<K, V> {  

	private class HMnode {

		K key;
		V value;

		HMnode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private LinkedList<HMnode>[] bucketarray;
	private int size;

	private hashmap(int cap) {
		this.bucketarray = (LinkedList<HMnode>[]) new LinkedList[cap];
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public int hashfunction(K key) {
		int hc = key.hashCode();
		return Math.abs(hc) % bucketarray.length;
	}

	public void put(K key, V Value) throws Exception {
		int bi = this.hashfunction(key);
		LinkedList<HMnode> bucket = this.bucketarray[bi];
		if (bucket == null) {
			bucket = new LinkedList<>();
			HMnode node = new HMnode(key, Value);
			bucket.Addlast(node);
			bucketarray[bi] = bucket;
			this.size++;
		} else {
			if (foundat(key, bucket) == -1) {
				HMnode temp = new HMnode(key, Value);
				bucket.Addlast(temp);
			} else {
				HMnode temp = bucket.getAt(foundat(key, bucket));
				temp.value = Value;
			}
		}
		double lambda = (this.size * 1.0) / bucketarray.length;
		if (lambda > 2.0) {
			rehash();
		}

	}

	public V get(K key) throws Exception {
		int bi = this.hashfunction(key);
		LinkedList<HMnode> bucket = this.bucketarray[bi];
		if (bucket == null) {
			return null;
		} else {
			if (foundat(key, bucket) == -1) {
				return null;
			} else {
				HMnode temp = bucket.getAt(foundat(key, bucket));
				return temp.value;
			}
		}

	}

	public boolean iscontained(K key) throws Exception {
		int bi = this.hashfunction(key);
		LinkedList<HMnode> bucket = this.bucketarray[bi];
		if (bucket == null) {
			return false;
		} else {
			if (foundat(key, bucket) == -1) {
				return false;
			} else {

				return true;
			}
		}

	}

	public V remove(K key) throws Exception {
		int bi = this.hashfunction(key);
		LinkedList<HMnode> bucket = this.bucketarray[bi];
		if (bucket == null) {
			return null;
		} else {
			if (foundat(key, bucket) == -1) {
				return null;
			} else {
				HMnode temp = bucket.removeAt(foundat(key, bucket));
				this.size--;
				return temp.value;

			}
		}

	}

	private int foundat(K key, LinkedList<HMnode> bucket) throws Exception {
		int rv = -1;
		for (int i = 0; i < bucket.size(); i++) {
			HMnode temp = bucket.removefirst();
			if (temp.key.equals(key)) {
				rv = i;
			}
			bucket.Addlast(temp);
		}
		return rv;
	}

	public void display() throws Exception {
		String rv = "";
		for (int i = 0; i < bucketarray.length; i++) {
			rv = rv + "bucket" + i;
			for (int j = 0; bucketarray[i] != null && j < bucketarray[i].size(); j++) {
				HMnode node = bucketarray[i].removefirst();
				rv = rv + node.value + node.key;
				bucketarray[i].Addlast(node);
			}
			System.out.println(rv);
		}

	}

	private void rehash() throws Exception {
		LinkedList<HMnode>[] oba = bucketarray;
	    this.bucketarray = (LinkedList<HMnode>[]) new LinkedList[2 * oba.length];
		this.size = 0;

		for (int i = 0; i < oba.length; i++) {
			for (int j = 0; oba[i] != null && j < oba[i].size(); j++) {
				HMnode node = oba[i].removefirst();

				this.put(node.key, node.value);
			}

		}
	}

	public ArrayList<K> keyset() throws Exception {
		ArrayList<K> rv = new ArrayList<>();

		for (int i = 0; i < bucketarray.length; i++) {
			for (int j = 0; bucketarray[i] != null && j < bucketarray[i].size(); j++) {
				HMnode node = bucketarray[i].removefirst();
				rv.add(node.key);
				bucketarray[i].Addlast(node);

			}

		}
		return rv;

	}

}
