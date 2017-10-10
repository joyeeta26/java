package Lecture6;

import java.util.Scanner;

public class CheckIfArrayIsSortedUsingRecurssion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
		boolean b = checksorted(arr, 0, arr.length - 1);
		System.out.println(b);
	}

	public static int[] takeinput() {
		System.out.println("enter size of array");
		int N = scn.nextInt();
		int rv[] = new int[N];
		for (int i = 0; i < N; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	public static boolean checksorted(int[] arr, int si, int li) {
		if (li == si) {
			
				return true;
			
		}
		if (arr[si] <= arr[si + 1] && checksorted(arr, si + 1, li) == true) {
			return true;
		} else {
			return false;
		}
	}
}
