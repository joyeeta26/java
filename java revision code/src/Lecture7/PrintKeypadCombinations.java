package Lecture7;

import java.util.Scanner;

public class PrintKeypadCombinations {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enetr no. of digits in the password");
		int n = scn.nextInt();
		printcombinations(n, "");

	}

	public static void printcombinations(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i <= 9; i++) {
			if (n == 1 && i == 0) {
				continue;
			}
			printcombinations(n - 1,i+ ans );
		}
	}
}
