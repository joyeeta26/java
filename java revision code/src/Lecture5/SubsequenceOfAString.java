package Lecture5;

import java.util.Scanner;

public class SubsequenceOfAString {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();

		int noofsubsequence = (int) Math.pow(2, str.length());
		for (int i = 0; i < noofsubsequence; i++) {
			int n = i;
			String s = "";
			for (int j = 0; j < str.length(); j++) {
				int rem = n % 2;
				if (rem == 1) {
					s = s + str.charAt(j);
				}

				n = n / 2;
			}
			System.out.println(s);
		}
	}

}
