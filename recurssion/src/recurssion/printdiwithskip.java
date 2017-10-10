package recurssion;

import java.util.Scanner;

public class printdiwithskip {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = scn.nextInt();
		fun(N);
	}

	public static void fun(int num) {
		if (num <= 0) {
			return;
		}
		if(num%2!=0)
		{System.out.println(num);}
		fun(num - 1);
		if (num %2==0) {
			System.out.println(num);
		}
	}
}
