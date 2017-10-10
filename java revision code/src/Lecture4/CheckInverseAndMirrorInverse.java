package Lecture4;

import java.util.Scanner;

public class CheckInverseAndMirrorInverse {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
		int other[] = takeinput();
		boolean b = ismirrorinverse(arr);
		System.out.println(b);
		boolean b1 = checkinverse(arr, other);
		System.out.println(b1);

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

	public static boolean ismirrorinverse(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[arr[i]] != i) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkinverse(int[] arr, int[] other) {
		if (arr.length != other.length) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {

			if (other[arr[i]] != i) {
				return false;
			}
		}
		return true;
	}

}
