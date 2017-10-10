package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndInverseOfArray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
		reverse(arr);
		display(arr);
		reverse(arr);
		display(arr);
		int rv[] = inverse(arr);
		display(rv);
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

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void reverse(int[] arr) {
		int li = 0;
		int hi = arr.length - 1;
		while (li < hi) {
			int temp = arr[li];
			arr[li] = arr[hi];
			arr[hi] = temp;
			li++;
			hi--;

		}
	}

	// inverse of 2,0,1,3 is 1,2,0,3 (2 is on zeroth position,therefore 0 will
	// be on second position)
	public static int[] inverse(int[] arr) {
		int rv[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rv[arr[i]] = i;
		}
		return rv;
	}

}
