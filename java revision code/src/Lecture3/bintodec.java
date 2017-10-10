package Lecture3;

import java.util.Scanner;

public class bintodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter binary form");
		int N = scn.nextInt();
		int p = 1;
		int dec = 0;
		while (N != 0) {
			int c = N % 10;
			dec = dec + c * p;
			p = p * 2;
			N = N / 10;
		}
		System.out.println("the decimal form is "+dec);
	}

}
