package Lecture6;

import java.util.Scanner;

public class PascalsTriangleUsingRecursion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		printpascal(0, 0, n, 1);
	}

	public static void printpascal(int si, int row, int totalrows, int prev) {
		if (si > row) {
			System.out.println();
			printpascal(0, row + 1, totalrows, 1);
			return;
		}
		if (row > totalrows) {
			return;
		}
		if (si == 0) {
			System.out.print("1");
		}

		else {
			System.out.print(" " + prev * (row - si+1) / (si ));
			prev=prev * (row - si+1) / (si );
		}

		printpascal(si + 1, row, totalrows, prev);
	}
}
