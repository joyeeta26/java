package Lecture10;

import java.util.Scanner;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(editdistance(s1, s2));
	}

	public static int editdistance(String s1, String s2) {
		int rv = 0;
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}
		char c1 = s1.charAt(0);
		char c2 = s2.charAt(0);
		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		if (c1 == c2) {
			rv = editdistance(ros1, ros2);
		} else {
			int t1 = 1 + editdistance(ros1, s2);
			int t2 = 1 + editdistance(s1, ros2);
			int t3 = 1 + editdistance(ros1, ros2);
			rv = Math.min(t1, Math.min(t2, t3));
		}
		return rv;
	}
}