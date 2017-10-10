package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class mazepathwitharraylist {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<String> list;
		list = getBoardPaths(0, 0, 2, 2);
		System.out.println(list);

	}

	public static ArrayList<String> getBoardPaths(int cc, int cr, int ec, int er) {
		if (cc == ec && cr == er) {
			ArrayList<String> baseResult = new ArrayList<>();

			baseResult.add("");

			return baseResult;

		}

		ArrayList<String> myResult = new ArrayList<>();
		if (cc < ec) {
			ArrayList<String> recResult = getBoardPaths(cc + 1, cr, ec, er);
			for (int i = 0; i < recResult.size(); i++) {
				myResult.add(recResult.get(i) + "H");
			}
		}
		if (cr < er) {
			ArrayList<String> recResult = getBoardPaths(cc, cr + 1, ec, er);
			for (int i = 0; i < recResult.size(); i++) {
				myResult.add(recResult.get(i) + "V");
			}
		}

		return myResult;
	}

}
