package Lecture3;

import java.util.Scanner;
// DectoAny,AnytoDec,BintoAny and AnytoBin conversion can be done directly but for AnytoAny conversion,2 functions are required,
// either use AnytoDec and then DectoAny or use AnytoBin and BintoAny 
public class anttoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(" enter no.");
		int N = scn.nextInt();
		System.out.println(" enter sb");
		int sb = scn.nextInt();
		System.out.println(" enter db");
		int db = scn.nextInt();
		int dec = sbtodec(N, sb);
		int ans = dectodb(dec, db);
		System.out.println(ans);

	}

	public static int sbtodec(int N, int sb) {
		int ans = 0;
		int p = 1;
		while (N != 0) {
			int c = N % 10;
			ans = ans + c * p;
			p = p * 8;
			N = N / 10;
		}
		return ans;
	}

	public static int dectodb(int dec, int db) {
		int ans = 0;
		int p = 1;
		while (dec != 0) {
			int c = dec % db;
			ans = ans + c * p;
			p = p * 10;
			dec = dec / db;
		}
		return ans;
	}
}
