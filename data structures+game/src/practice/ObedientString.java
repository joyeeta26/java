package practice;

import java.util.Scanner;

public class ObedientString {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();
		String g = str + "  ";
		if(str.charAt(0)!='a')
			{System.out.println(false);}
		else
		{Boolean b = check(g, 0);
		System.out.println(b);}
	}

	public static Boolean check(String str, int s) {
		if (str.charAt(s)==' ') {
			return true;
		}
		
		if (str.charAt(s) == 'a' && !(str.substring(s + 1, s + 3).equals("bb"))&&!str.substring(s + 1, s + 3).equals("  ")&&str.charAt(s+1)!='a') { 
			return false;
		}

		else if (str.substring(s, s + 2).equals("bb") && str.charAt(s + 2) !='a'&& str.charAt(s + 2) != ' ') {
			return false;
		} else {
			Boolean b = check(str, s + 1);
			return b;
		}
	}

}