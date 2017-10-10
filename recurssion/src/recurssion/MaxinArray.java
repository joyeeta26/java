package recurssion;

import java.util.Scanner;

public class MaxinArray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = take();

		int si = scn.nextInt();

		int b = max(arr, si);
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

	public static int max(int[] arr, int si) {
		if (si == arr.length - 1) {
			return arr[arr.length - 1];
		}
		if (arr[si] > max(arr, si + 1)) {
			return arr[si];
		} else {
			return max(arr, si + 1);
		}
	}
}
