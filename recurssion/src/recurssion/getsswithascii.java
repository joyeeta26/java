package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class getsswithascii {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();
String abc="";
	
	
		subset(str,abc);
		
	}

	public static void subset(String str,String sol) {
		if (str.length() == 0) {
			System.out.println(sol);
		
			return ;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		subset(ros,sol+"");
		subset(ros,sol+ch);
		subset(ros,sol+(int)ch);
		
	}

}
