package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char c = maxfr("avuekbdaaa");
		// System.out.println(c);
		Integer one[] = { 1, 1, 2, 2, 2, 3, 5 };
		Integer two[] = { 1, 1, 1, 2, 2, 4, 5 };
		Integer input[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
		// System.out.println(gce2(one, two));
		System.out.println(cons(input));

	}

	public static Character maxfr(String str) {
		HashMap<Character, Integer> freqmap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (freqmap.containsKey(str.charAt(i))) {
				int ov = freqmap.get(str.charAt(i));
				int nv = ov + 1;
				freqmap.put(str.charAt(i), nv);
			}

			else {
				freqmap.put(str.charAt(i), 1);
			}
		}

		Set<Character> keys = freqmap.keySet();
		int maxval = Integer.MIN_VALUE;
		Character maxchar = '\0';
		for (Character key : keys) {
			if (freqmap.get(key) > maxval) {
				maxval = freqmap.get(key);
				maxchar = key;
			}

		}
		return maxchar;

	}

	public static ArrayList<Integer> gce1(Integer one[], Integer[] two) {
		HashMap<Integer, Integer> gceone = new HashMap<>();
		HashMap<Integer, Integer> gcetwo = new HashMap<>();
		ArrayList<Integer> rv = new ArrayList<>();
		for (Integer val : one) {
			if (gceone.containsKey(val)) {
				int ov = gceone.get(val);
				int nv = ov + 1;
				gceone.put(val, nv);
			} else {
				gceone.put(val, 1);
			}
		}
		for (Integer valu : two) {
			if (gcetwo.containsKey(valu)) {
				int ov = gcetwo.get(valu);
				int nv = ov + 1;
				gcetwo.put(valu, nv);
			} else {
				gcetwo.put(valu, 1);
			}
		}

		Set<Integer> oneset = gceone.keySet();
		Set<Integer> twoset = gcetwo.keySet();
		for (Integer i : oneset) {
			if (gcetwo.containsKey(i)) {
				rv.add(i);
			}

		}

		return rv;
	}

	public static ArrayList<Integer> gce2(Integer one[], Integer[] two) {
		HashMap<Integer, Integer> gceone = new HashMap<>();
		HashMap<Integer, Integer> gcetwo = new HashMap<>();
		ArrayList<Integer> rv = new ArrayList<>();
		for (Integer val : one) {
			if (gceone.containsKey(val)) {
				int ov = gceone.get(val);
				int nv = ov + 1;
				gceone.put(val, nv);
			} else {
				gceone.put(val, 1);
			}
		}
		for (Integer valu : two) {
			if (gcetwo.containsKey(valu)) {
				int ov = gcetwo.get(valu);
				int nv = ov + 1;
				gcetwo.put(valu, nv);
			} else {
				gcetwo.put(valu, 1);
			}
		}

		Set<Integer> oneset = gceone.keySet();
		Set<Integer> twoset = gcetwo.keySet();
		for (Integer i : oneset) {
			if (gcetwo.containsKey(i)) {
				int f1 = gceone.get(i);
				int f2 = gcetwo.get(i);
				for (int o = 1; o <= Math.min(f1, f2); o++) {
					rv.add(i);
				}
			}
		}

		return rv;
	}

	public static ArrayList<Integer> cons(Integer[] input) {
		HashMap<Integer, Boolean> consone = new HashMap<>();

		ArrayList<Integer> rv = new ArrayList<>();
		for (Integer val : input) {

			if (consone.containsKey(val - 1)) {
				consone.put(val, false);
			}
			if (consone.containsKey(val + 1)) {
				
				consone.put(val + 1, false);
				consone.put(val, true);
			}
			else{
				consone.put(val, true);
			}
		}

		Set<Integer> set = consone.keySet();
		for (Integer i : set) {
			if (consone.get(i) == true) {
				int p = i;
				int c = 0;
				while (consone.containsKey(p)) {
					c++;
					p++;
				}
				p = i;
				if (c > rv.size()) {
					rv = new ArrayList<>();
					while (consone.containsKey(p)) {
						rv.add(p);
						p++;
					}
				}
			}
		}
		return rv;
	}

}
