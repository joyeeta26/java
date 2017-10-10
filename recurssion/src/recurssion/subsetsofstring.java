package recurssion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subsetsofstring {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = "abc";

		ArrayList<String> list;
	
		list = subset(str);
		
		System.out.println(list);
	}

	public static ArrayList<String> subset(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return baseresult;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> recResult = subset(ros);
		ArrayList<String> myResult = new ArrayList<>();
		for (int i = 0; i < recResult.size(); i++) {
			System.out.println(recResult.get(i));
			myResult.add("" + recResult.get(i));
			myResult.add(ch + recResult.get(i));
		}
		return myResult;
	}

}