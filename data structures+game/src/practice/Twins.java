package practice;

import java.util.Scanner;

public class Twins {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	String str=scn.nextLine();
	
	int s= counttwins(str,0,0);
	System.out.println(s);
	
	
	}
	public static int counttwins(String str,int s,int p)
	{	
		if(s+2==str.length())
	{ return p;
	}
		 if(str.charAt(s)==str.charAt(s+2))  
	
	{   p=p+1;}
	        int c=   counttwins(str,s+1,p);  
	     return c;
	}	
	}