package Lecture7;

import java.util.ArrayList;
import java.util.Scanner;

public class returnPermutations {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		ArrayList<String> list = permutations(str);
		System.out.println(list);
	}

	public static ArrayList<String> permutations(String str) {
		if (str.length() == 1) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add(str.charAt(0) + "");
			return baseresult;
		}

		ArrayList<String> myresult = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			ArrayList<String> recresult = permutations(ros);
			for (int j = 0; j < recresult.size(); j++) {
				myresult.add(ch + recresult.get(j));
			}

		}
		return myresult;
	}
}
