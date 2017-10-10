package Lecture1;

import java.util.Scanner;

public class PrintPatterns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// N means no. of lines
		int N = scn.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = N; j > i; j--) {
				System.out.print("  ");
			}
			for (int k = i; k <= 2 * i - 1; k++) {
				System.out.print(k + " ");
			}
			for (int p = 2 * i - 2; p >= i; p--) {
				System.out.print(p+ " ");
			}
System.out.println();
		}
	}

}
