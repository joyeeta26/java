package Lecture7;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBoardPaths {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter end position");
		int end = scn.nextInt();
		ArrayList<String> list = boardpath(0, end);
		System.out.println(list);
	}

	public static ArrayList<String> boardpath(int curr, int end) {

		if (curr == end) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}
		if (curr > end) {
			ArrayList<String> baseresult = new ArrayList<>();

			return baseresult;
		}
		ArrayList<String> myresult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> recresult = boardpath(curr + dice, end);
			for (int i = 0; i < recresult.size(); i++) {
				myresult.add(dice + recresult.get(i));
			}
		}
		return myresult;

	}
}
