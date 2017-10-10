package Lecture9;

import java.util.Scanner;

public class PalindromicSubstrings {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		String str = scn.nextLine();
		int odd = checkodd(str);
		int even = checkeven(str);
		System.out.println(even + odd);
	}

	public static int checkodd(String str) {
		int odd = 0;

		for (int axis = 0; axis < str.length(); axis++) {
			int orbit = 0;
			while (axis - orbit >= 0 && axis + orbit < str.length()) {
				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					odd++;
				}

				else {
					break;
				}

				orbit++;
			}
		}
		return odd;

	}

	public static int checkeven(String str) {
		int even = 0;

		for (double axis = 0.5; axis < str.length(); axis++) {
			double orbit = 0.5;
			while (axis - orbit >= 0 && axis + orbit < str.length()) {
				if (str.charAt((int) (axis - orbit)) == str.charAt((int) (axis + orbit))) {
					even++;
				}

				else {
					break;
				}

				orbit++;
			}
		}
		return even;

	}

}