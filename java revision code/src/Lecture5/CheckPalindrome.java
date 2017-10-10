package Lecture5;

import java.util.Scanner;

public class CheckPalindrome {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		boolean b = true;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				b = false;
				System.out.println("Not palindromic");
				break;
			}
		}
		if (b) {
			System.out.println("palindromic");
		}
	}

}
