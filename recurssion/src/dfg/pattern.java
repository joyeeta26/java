package dfg;

import java.util.Scanner;

public class pattern {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();

		String sc = patterns(str);
		System.out.println(sc);
	}

	public static String patterns(String str) {
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++) {
			if (i % 2 == 0) {
			
				
				sb.setCharAt(i,(char)(sb.charAt(i)+1));
			} else {
				sb.setCharAt(i,(char)( sb.charAt(i) - 1));
			}
		}
		return sb.toString();
	}
}
