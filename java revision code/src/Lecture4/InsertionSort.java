package Lecture4;

import java.util.Scanner;

public class InsertionSort {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
		display(arr);
		insertionsort(arr);
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
// in this we first sort smaller array of size 1,then array of size 2 and so on till the entire array gets sorted
	public static void insertionsort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j >= 1; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;        // no need to check further if arr[j-1]>arr[j],
					              //bcz automatically elements before arr[j-1] will be less than arr[j] 
				}
			}

		}

	}

}
