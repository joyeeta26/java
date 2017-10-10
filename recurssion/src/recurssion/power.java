package recurssion;

import java.util.Scanner;

public class power {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = scn.nextInt();
		int n = scn.nextInt();
		int c=power(x,n);
		System.out.println(c);
	}

	public static int power(int x,int n) {
		if (n == 0) {
			return 1;
		}
		int r=x*power(x,n-1);
		return r;
		}
	}
