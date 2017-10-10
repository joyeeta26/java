package Lecture7;

import java.util.Scanner;

public class PrintPermutations {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = scn.next();
		printpermutations(s, "");
	}

	public static void printpermutations(String ques, String ans)

	{
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			printpermutations(ros, ans + c);
		}

	}
}
