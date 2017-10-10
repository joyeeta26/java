package Lecture8;

import java.util.Scanner;

public class NoOfPathInABoard {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter end");
		int n = scn.nextInt();
		System.out.println(numpath(0, n));
	}

	public static int numpath(int curr, int end) {
		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int c = 0;
		for (int dice = 1; dice <= 6; dice++) {
			c = numpath(curr + dice, end) + c;

		}
		return c;
	}
}
