package dfg;

import java.util.Scanner;

public class stringrotation {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = scn.nextLine();
		int k = scn.nextInt();
		int l = scn.nextInt();
		String rotated = rotateword(str, k);
		System.out.println(rotated);
		String finalrotated = rotatealpha(rotated, l);

	}

	public static String rotateword(String str, int k) {
		String[] arr = str.split(" ");
		String[] rotateword = new String[arr.length];
		k = k % arr.length;
		if (k < 0)
			k = k + arr.length;
		for (int ri = 0; ri < arr.length; ri++) {
			int ov = (ri + arr.length - k) % arr.length;

			rotateword[ri] = arr[ov];

		}
		String rv = String.join(" ", rotateword);
		return rv;
	}

	public static String rotatealpha(String rotateword, int l) {
		l = l % rotateword.length();
		if (l < 0)
			l = l + rotateword.length();
		String rv = "";
		for (int ri = 0; ri < rotateword.length(); ri++) {
			int ov = (ri + rotateword.length() - l) % rotateword.length();
			rv = rv + rotateword.charAt(ov);

		}
		return rv;
	}
}
