package dfg;

import java.util.Scanner;

public class bubblesort {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = take();
		display(arr);
		sort(arr);
		display(arr);

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

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void sort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}
}
