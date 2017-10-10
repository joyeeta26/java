package dfg;

import java.util.Scanner;

public class insertdiff {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = scn.nextLine();
		patterns(str);
		
	}

	public static void patterns(String str) {
		StringBuilder sb = new StringBuilder();
		System.out.print(str.charAt(0));
		int previous = 0;
		for (int i = 1; i<str.length(); i++) {
			  char ch=str.charAt(i);
				
				sb.append(str.charAt(i)-str.charAt(previous));
				sb.append(ch);
				previous=i;}	
		
					  System.out.println(sb);
		
	}
}
