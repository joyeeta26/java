package Lecture4;

import java.util.Scanner;

public class SlectionSort {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
		display(arr);
		selectionsort(arr);
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

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void selectionsort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} 
			}

		}

	}

}
