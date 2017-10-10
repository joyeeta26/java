package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetssWithArrayList {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		String str = scn.nextLine();
		ArrayList<String> list;
		list = subset(str);
		System.out.println(list);

		
	}

	public static  ArrayList<String>  subset(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();

			baseResult.add("");

			return baseResult;
		
		}
		ArrayList<String> myResult = new ArrayList<>();
		char ch = str.charAt(str.length()-1);
		String ros=str.substring(0,str.length()-1);
		ArrayList<String> recResult = subset(ros);
		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));}
			for ( int i = 0; i < recResult.size(); i++) {
				myResult.add(recResult.get(i)+ch );
			}
			for ( int i = 0; i < recResult.size(); i++) {
				myResult.add(recResult.get(i)+(int)ch );
			}
			return myResult;
		}
		
		
		
	}

