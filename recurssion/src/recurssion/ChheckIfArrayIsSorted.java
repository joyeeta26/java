package recurssion;

import java.util.Scanner;

public class ChheckIfArrayIsSorted {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = take();
		Boolean b = check(arr, 0);
		System.out.println(b);

	}

	public static int[] take() {
		int[] rv = null;
		System.out.println("enter size of array");
		int n = scn.nextInt();
		rv = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + (i) + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static Boolean check(int[] arr, int si) {
		if (si == arr.length - 1) {
			return true;
		}
		if (arr[si] > arr[si + 1]) {
			return false;
		} else {
			Boolean b = check(arr, si + 1);
			return b;
		}

	}
}