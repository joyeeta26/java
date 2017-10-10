package Lecture6;

import java.util.Scanner;

public class PatternUsingRecursion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		printpattern(0, 1, n);
	}

	public static void printpattern(int si, int row, int totalrows) {
		if (row > totalrows) {
			return;
		}
		if (si == row) {
			System.out.println();
			printpattern(0, row + 1, totalrows);
			return;
		}
		System.out.print("*");
		printpattern(si + 1, row, totalrows);
	}
}
