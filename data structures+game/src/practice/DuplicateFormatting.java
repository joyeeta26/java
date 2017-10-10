package practice;

import java.util.Scanner;

public class DuplicateFormatting {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 String str=scn.nextLine();
	String s= DuplicareFormatted(str,0);
	System.out.println(s);
	
	}
	
		
		public static String DuplicareFormatted(String str,int si) 
		{   
			
			if(si==str.length()-1)
			{ return str;}
			
			if(str.charAt(si)==str.charAt(si+1))
			{ 
				StringBuilder sb =new StringBuilder(str);
				sb.insert(si+1, "*");
	           str=	 sb.toString();
	           String s= DuplicareFormatted(str,si+2);
				}
			
			String s= DuplicareFormatted(str,si+1);
			return s;
		}}