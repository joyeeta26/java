package heap;

import java.util.ArrayList;
import java.util.HashMap;

public class Heap<T extends Comparable<T>> {

	ArrayList<T> data;
	boolean ismin;
	HashMap<T, Integer> posmap;

	public Heap(boolean ismin)

	{
		data = new ArrayList<>();
		this.ismin = ismin;
		posmap = new HashMap<>();
	}

	public Heap(boolean ismin, T[] arr) {
		this.ismin = ismin;
		for (T item : arr) {
			this.data.add(item);
		}
		for (int i = this.data.size() / 2 - 1; i >= 0; i--) {
			this.downheapify(i);
		}

	}

	public int size() {
		return data.size();
	}

	public boolean isempty() {
		return data.size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public T getHP() {
		return data.get(0);
	}

	public void add(T item) {
		data.add(item);
		posmap.put(item, data.size() - 1);
		this.upheapify(data.size() - 1);
	}

	public void upheapify(int ci) {
		if (ci == 0) {
			return;
		}

		int pi = (ci - 1) / 2;
		if (isHP(ci, pi)) {
			swap(ci, pi);
			upheapify(pi);
		}
	}

	public T remove() {
		T temp = data.get(0);

		this.swap(0, this.data.size() - 1);
		posmap.remove(temp);
		this.data.remove(this.data.size() - 1);
		downheapify(0);

		return temp;
	}

	public void downheapify(int pi) {
		int lci = 2 * (pi) + 1;

		int rci = 2 * pi + 2;
		int max = pi;

		if (lci < data.size() && this.isHP(lci, max)) {
			max = lci;
		}
		if (rci < data.size() && this.isHP(rci, max)) {
			max = rci;
		}

		if (max != pi) {
			this.swap(max, pi);
			downheapify(max);
		}
	}

	public void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
		posmap.put(ith, j);
		posmap.put(jth, i);
	}

	public boolean isHP(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		if (ismin) {
			if (ith.compareTo(jth) > 0) {
				return false;
			} else {
				return true;
			}
		} else {
			if (ith.compareTo(jth) > 0) {
				return true;
			} else {
				return false;
			}
		}

	}

	public int getindex(T item) {
		return posmap.get(item);
	}
}
