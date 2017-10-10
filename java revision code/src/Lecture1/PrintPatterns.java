package Lecture1;

import java.util.Scanner;

public class PrintPatterns {
// to print pattern 1
	     //         2  3
	//              4  5  6
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// N stands for no. of lines
		int N = scn.nextInt();
		int c = 1;
		for (int i = 1; i <= N; i++)

		{
			for (int j = 0; j < i; j++) {
				System.out.print(c+" " );
				c++;
			}
			System.out.println();
		}
	}

}
