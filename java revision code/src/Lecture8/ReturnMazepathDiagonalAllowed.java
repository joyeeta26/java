package Lecture8;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnMazepathDiagonalAllowed {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rows and columns in a maze");
		int row = scn.nextInt();
		int col = scn.nextInt();
		ArrayList<String> list = returnmazepath(0, row, 0, col);
		System.out.println(list);
	}

	public static ArrayList<String> returnmazepath(int cr, int er, int cc, int ec) {
		if (cc == ec && cr == er) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add(""); // this line is important to make the size of baseresult =1,so that loop of recresult gets executed
			return baseresult;
		}
		ArrayList<String> myresult = new ArrayList<>();
		if (cr != er) {
			ArrayList<String> recresult = returnmazepath(cr + 1, er, cc, ec);
			for (int i = 0; i < recresult.size(); i++) {
				myresult.add("V" + recresult.get(i));
			}
		}
		if (cc != ec) {
			ArrayList<String> recresult = returnmazepath(cr, er, cc + 1, ec);
			for (int i = 0; i < recresult.size(); i++) {
				myresult.add("H" + recresult.get(i));
			}
		}
			if (cc != ec&&cr!=er) {
				ArrayList<String> recresult = returnmazepath(cr+1, er, cc + 1, ec);
				for (int i = 0; i < recresult.size(); i++) {
					myresult.add("D" + recresult.get(i));
				}
			
		}
		return myresult;
	}
}