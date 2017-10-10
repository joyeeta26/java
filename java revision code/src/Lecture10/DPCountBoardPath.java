package Lecture10;

import java.util.Scanner;

public class DPCountBoardPath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter end");
		int n = scn.nextInt();
		int arr[] = new int[n + 1];
		System.out.println(countBP(0, n, arr));

	}

	public static int countBP(int curr, int end, int[] arr) {
		
		
		if (curr == end) {
			return 1;
		}
		int sum = 0;
		for (int dice = 1; dice<=6&&curr+dice <= end; dice++) {
			if (arr[curr + dice] != 0) {
				sum = sum + arr[curr + dice];
			} else {
				sum =  countBP(curr + dice, end, arr)+sum;
			}
		}
		arr[curr] = sum;
		return sum;
	}
}
