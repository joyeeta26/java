package practice;

import java.util.Scanner;

public class Parenthesis {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	String str=scn.nextLine();
	
	String b= check(str,0,0);
	System.out.println(b);	
	}
	public static String check(String str,int s,int p)
	{   if(str.charAt(s)=='(')
	{    p=s;
    	}
	 if(str.charAt(s)==')')
		{   int o=s;
		  return str.substring(p+1,o);
		}
	    	
	 String b= check(str,s+1,p);
		return b;}

}