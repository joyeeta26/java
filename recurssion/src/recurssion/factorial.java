package recurssion;

import java.util.Scanner;

public class factorial {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = scn.nextInt();
		int c=fac(N);
		System.out.println(c);
	}

	public static int fac(int num) {
		if (num == 1) {
			return 1;
		}
		int r=num*fac(num-1);
		return r;
		}
	}
