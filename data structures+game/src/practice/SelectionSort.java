package practice;

import java.util.Scanner;

public class SelectionSort {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = take();

		int si = 0;
		int li = 1;

		 ss(arr, si, li);
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

	public static void ss(int arr[], int si, int li) {
		
		if ( si==arr.length-1) {
		//	System.out.println("h");
			return ;
		}
		if (li == arr.length) {
			 ss(arr, si+1 , si+2);
			 return;
		}

	//System.out.println(li);
		
		if (arr[si] > arr[li]) 
		{
			int temp = arr[si];
			arr[si] = arr[li];
			arr[li] = temp;
	
		}
            ss(arr, si , li+1);
            return;
	}
}
