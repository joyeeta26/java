package Lecture8;

import java.util.Scanner;

public class NQueensProblem {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(" enter size of chessboard");
		 int n = scn.nextInt();
		boolean arr[][] = new boolean[n][n];
		printsafeposition(0, 0, arr, "");
	}

	public static void printsafeposition(int r, int c, boolean arr[][], String ans) {

		if (c == arr[0].length) {

			System.out.println(ans);
			return;

		}

		if (r == arr.length) {
			return;
		}

		if (IsItSafetoplaceQueen(r, c, arr)) {
			arr[r][c] = true;

			printsafeposition(0, c + 1, arr, ans + r + " " + c + "   ");
			arr[r][c] = false;
			printsafeposition(r + 1, c, arr, ans);

		}

		else {
			printsafeposition(r + 1, c, arr, ans);
		}

	}

	public static boolean IsItSafetoplaceQueen(int row, int col, boolean arr[][]) {
		for (int i = 0; i < row; i++) {
			if (arr[i][col] == true) {
				return false;
			}
		}
		for (int i = 0; i < col; i++) {
			if (arr[row][i] == true) {
				return false;
			}
		}
		int i = 1;
		while (row - i >= 0 && col - i >= 0) {
			if (arr[row - i][col - i] == true) {
				return false;
			}
			i++;
		}
		int j = 1;
		while (row + j < arr.length && col - j >= 0) {
			if (arr[row + j][col - j] == true) {
				return false;
			}
			j++;
		}
		return true;
	}
}
