package practice;

import java.util.Scanner;

public class NoOfa {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	String str=scn.nextLine();
	
	int s= countAoverlap(str,0,0);
	System.out.println(s);
	int sp= countAnonOverlap(str,0,0);
	System.out.println(sp);
	}
	public static int countAoverlap(String str,int s,int p)
	{	
		if(s+2==str.length())
	{ return p;
	}
		 if(str.charAt(s)=='a'&&str.charAt(s+1)=='a'&&str.charAt(s+2)=='a')  
	
	{   p=p+1;}
	        int c=  countAoverlap(str,s+1,p);  
	     return c;
	}	
	public static int countAnonOverlap(String str,int s,int p)
	{	
		if(s+2>=str.length())
	{ return p;
	}
		 if(str.charAt(s)=='a'&&str.charAt(s+1)=='a'&&str.charAt(s+2)=='a')  
	
	{   p=p+1;
	        int c=   countAnonOverlap(str,s+3,p);  
	     return c;
	}	
		 else
		 { int c=   countAnonOverlap(str,s+1,p);  
	     return c;}
			 }
}	
