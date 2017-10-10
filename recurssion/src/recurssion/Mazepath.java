package recurssion;

import java.util.Scanner;

public class Mazepath {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		

		getBoardPaths(0, 0, 2, 2, "");
		// System.out.println(sum[0]);
		// sort(sum);
		// display(sum);

	}

	public static void getBoardPaths(int cc, int cr, int ec, int er, String path) {
		if (cc == ec && cr == er) {
			System.out.println(path);
			return;
		}
		if(cc>ec||cr>er){
			return;
		}
			getBoardPaths(cc + 1, cr, ec, er, path + "H");
			getBoardPaths(cc, cr + 1, ec, er, path + "V");
		

	}

}
