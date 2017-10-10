package Lecture10;

import java.util.Scanner;

// we have to make 2 strings equal using minimum no of operations..,we can add a letter,delete 
//a letter or change a letter of the second string
public class EditDistanceDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(editdistance(s1, s2, new int[s1.length() + 1][s2.length() + 1]));
	}

	public static int editdistance(String s1, String s2, int[][] strg) {
		int rv = 0;
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		if (c1 == c2) {
			if (strg[ros1.length()][ros2.length()] != 0) {
				rv = strg[ros1.length()][ros2.length()];
			} else {
				rv = editdistance(ros1, ros2, strg);
			}
		} else {
			int t1, t2, t3 = 0;
			if (strg[ros1.length()][s2.length()] != 0) {
				t1 = 1+strg[ros1.length()][s2.length()];
			} else {
				t1 = 1 + editdistance(ros1, s2, strg);
			}
			if (strg[s1.length()][ros2.length()] != 0) {
				t2 =1+ strg[s1.length()][ros2.length()];
			} else {
				t2 = 1 + editdistance(s1, ros2, strg);
			}
			if (strg[ros1.length()][ros2.length()] != 0) {
				t3 = 1+strg[ros1.length()][ros2.length()];
			} else {
				t3 = 1 + editdistance(ros1, ros2, strg);
			}
			rv = Math.min(t1, Math.min(t2, t3));
		}
		strg[s1.length()][s2.length()] = rv;
		return rv;
	}
}
