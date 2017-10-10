import java.util.Scanner;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		int s = longest(s1, s2, new int[s1.length() + 1][s2.length() + 1]);
		System.out.println(s);

	}

	public static int longest(String s1, String s2, int[][] strg) {
		int rv = 0;

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		if (strg[s1.length()][s2.length()] != 0) {
			return strg[s1.length()][s2.length()];
		}
		char ch = s1.charAt(0);
		String ros = s1.substring(1);

		char c = s2.charAt(0);
		String ro = s2.substring(1);
		if (ch == c) {
			rv = 1 + longest(ros, ro, strg);
		} else {
			int t = longest(ros, s2, strg);
			int tr = longest(s1, ro, strg);
			rv = Math.max(t, tr);
		}
		strg[s1.length()][s2.length()] = rv;
		return rv;

	}

}
