package recurssion;

import java.util.Scanner;

public class bubblesort {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = take();

		int si = 0;
		int li = arr.length - 1;

		 bubblesort(arr, si, li);
		display(arr);

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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

	public static void bubblesort(int arr[], int si, int li) {
		
		if (li == 0) {
			return;
		}
if (si == li) {
			bubblesort(arr, 0, li - 1);
			return;
		}
	
		
		if (arr[si] > arr[si + 1]) {
			int temp = arr[si];
			arr[si] = arr[si + 1];
			arr[si + 1] = temp;
	
		}

		bubblesort(arr, si + 1, li);
	}
}
