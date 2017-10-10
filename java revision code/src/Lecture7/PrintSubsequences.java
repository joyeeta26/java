package Lecture7;

import java.util.Scanner;

public class PrintSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String ss = scn.next();
		printsubsequence(ss, "");
	}

	public static void printsubsequence(String ss, String ans) {
        if(ans!="")
        {
        	System.out.println(ans);
        }
		if (ss.length()==0) {
			return;
		}
		if (ans == "") {
			for (int i = 0; i < ss.length(); i++) {
				char c = ss.charAt(i);
				String ros = ss.substring(i + 1);
				printsubsequence(ros, ans + c);
			}
		} else {
			char c = ss.charAt(0);
			String ros = ss.substring(1);
			printsubsequence(ros, ans + c);
		}

	}
}
