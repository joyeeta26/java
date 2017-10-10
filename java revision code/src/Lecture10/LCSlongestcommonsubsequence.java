package Lecture10;

import java.util.Scanner;

public class LCSlongestcommonsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String ss = scn.nextLine();
		int[][] strg = new int[s.length() + 1][ss.length() + 1];
		System.out.println(LCS(s, ss, strg));
	}

	public static int LCS(String s, String ss, int[][] strg) {
		if (s.length() == 0 || ss.length() == 0) {
			return 0;
		}
		char c = s.charAt(0);
		String ros = s.substring(1);
		char cc = ss.charAt(0);
		String rosros = ss.substring(1);
		int rv = 0;

		if (c == cc) {
			if (strg[ros.length()][rosros.length()] != 0) {
				rv = 1+strg[ros.length()][rosros.length()];
			} else {
				rv = 1 + LCS(ros, rosros, strg);
			}
		} else {
			int t1 = 0;
			int t2 = 0;
			if (strg[s.length()][rosros.length()] != 0) {
				t1 = strg[s.length()][rosros.length()];
			} else {
				t1 = LCS(s, rosros, strg);
			}
			if (strg[ros.length()][ss.length()] != 0) {
				t2 = strg[ros.length()][ss.length()];
			} else {
				t2 = LCS(ros, ss, strg);
			}
			rv = Math.max(t1, t2);
		}
		strg[s.length()][ss.length()] = rv;
		return rv;
	}
}
