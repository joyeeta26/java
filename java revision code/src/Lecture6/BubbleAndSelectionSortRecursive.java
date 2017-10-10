package Lecture6;

import java.util.Scanner;

public class BubbleAndSelectionSortRecursive {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
	
	//bubblesort(arr,0,arr.length-1);
	//display(arr);
		selectionsort(arr, 0, 1);
	   display(arr);
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
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public static void bubblesort(int[] arr, int si, int li) {
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

	public static void selectionsort(int[] arr, int si, int li) {
		if (si == arr.length - 1) {
			return;
		}
		if (li == arr.length) {
			selectionsort(arr, si + 1, si + 2);
           return;
		}
		if (arr[si] > arr[li]) {
			int temp = arr[si];
			arr[si] = arr[li];
			arr[li] = temp;
		}
		selectionsort(arr, si, li + 1);

	}
}
