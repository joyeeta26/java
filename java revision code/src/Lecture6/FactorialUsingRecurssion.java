package Lecture6;

import java.util.Scanner;

public class FactorialUsingRecurssion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scn.nextInt();
		int f = factorial(n);
		System.out.println(f);
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
