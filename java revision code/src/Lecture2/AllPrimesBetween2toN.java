package Lecture2;

import java.util.Scanner;

public class AllPrimesBetween2toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		boolean b = true;
		int N = scn.nextInt();
		for (int i = 2; i < N; i++) {
			b = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					b = !b;
					break;
				}

			}
			if (b) {
				System.out.print(i + " ");
			}
		}

	}

}
