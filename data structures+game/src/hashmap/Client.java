package hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,5,5,10,10 };
		System.out.println(equalize(arr));

	}

	public static int equalize(int[] arr) {
		// no.s can be equalised at n,n-1 or n-2 
		
		//n,n can be equalised at n
		//n,n+1 can be equalised at n
		//n,n+2 can be equalised at n 
		//n,n+3 can be equalised at n or n-2
		//n,n+4 can be equalised at n or n-1
		
		Arrays.sort(arr);
		int min = arr[0];
		int ops = 0;
		int numf = 0;
		HashMap<Integer, Integer> hp = new HashMap<>();
		hp.put(0, 0);
		hp.put(1, 0);
		hp.put(2, 0);
		hp.put(3, 0);
		hp.put(4, 0);
		for (int i = 0; i < arr.length; i++) {
			int delta = arr[i] - min;
			ops = ops + delta / 5;
			numf = delta % 5;
			int ov = hp.get(numf);
			int nv = ov + 1;
			hp.put(numf, nv);
		}
		//for equalising at n
		int f1 = hp.get(0) * 0 + hp.get(1) * 1 + hp.get(2) * 1 + hp.get(3) * 2 + hp.get(4) * 2;
		//for equalising at n-1
		int f2 = hp.get(0) * 1 + hp.get(1) * 1 + hp.get(2) * 2 + hp.get(3) * 2 + hp.get(4) * 1;
		//for equalisng at n-2
		int f3 = hp.get(0) * 1 + hp.get(1) * 2 + hp.get(2) * 2 + hp.get(3) * 1 + hp.get(4) * 2;
		//equalising at n-3 will be costlier than equalising at n 
		int f = Math.min(f1, Math.min(f2, f3));
		ops = ops + f;
		return ops;
	}
}
