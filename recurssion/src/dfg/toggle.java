package dfg;

import java.util.Scanner;

public class toggle {

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
			
			if(sb.charAt(i)<=90&&sb.charAt(i)>=65)	
				{ char ch= (char)(sb.charAt(i)+'a'-'A');
				   sb.setCharAt(i, ch);
				}
			else
			{  char ch= (char)(sb.charAt(i)-'a'+'A');
			   sb.setCharAt(i, ch);
				}
		}
      return sb.toString();	
}
}