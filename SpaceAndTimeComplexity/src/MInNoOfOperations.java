import java.util.Scanner;

public class MInNoOfOperations {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int t = minoperations(n, new int[n + 1]);
		System.out.println(t);
	}

	public static int minoperations(int n, int[] strg) {
		int rv = 0;

		if (n == 1) {
			return 0;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int r1 = 1 + minoperations(n - 1, strg);
		if (n % 2 == 0 && n % 3 != 0) {
			int r2 = 1 + minoperations(n / 2, strg);
			rv = Math.min(r1, r2);
		} else if (n % 3 == 0 && n % 2 != 0) {
			int r2 = 1 + minoperations(n / 3, strg);
			rv = Math.min(r1, r2);
		} else if (n % 3 == 0 && n % 2 == 0) {
			int r2 = 1 + minoperations(n / 2, strg);
			int r3 = 1 + minoperations(n / 3, strg);
			rv = Math.min(r1, Math.min(r2, r3));
		} else if (n % 3 != 0 && n % 2 != 0) {
			rv = r1;
		}
		strg[n] = rv;
		return rv;
	}
}
