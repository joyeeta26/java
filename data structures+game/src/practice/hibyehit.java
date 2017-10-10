package practice;

import java.util.Scanner;

public class hibyehit {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	String stp=scn.nextLine();
	String str=stp+" ";
	int s= countHi(str,0,0);
	System.out.println(s);
	String se=remove(str,0);
	System.out.println(se);
	String newstring=replace(str,0);
	System.out.println(newstring);
	
	}
	public static int countHi(String str,int s,int p)
	{	
		if(s+1==str.length())
	{ return p;
	}
		 if(str.charAt(s)=='h'&&str.charAt(s+1)=='i'&&str.charAt(s+2)!='t')  
	
	{   p=p+1;}
	        int c=   countHi(str,s+1,p);  
	     return c;
	}	
		 public static String remove(String str,int s) 
		{   if(s+1>=str.length())
		   { 
			 return str;} 
		
			 if(str.charAt(s)=='h'&&str.charAt(s+1)=='i'  &&str.charAt(s+2)!='t')  
			 { StringBuilder sb=new StringBuilder(str);
			    sb.delete(s, s+2);
			    str= sb.toString();
			    String st=remove(str,s);
			   return st;}
			 else 
			 {  String st=remove(str,s+1);
			 return st;}
		}

public static String replace(String str,int s ) 
{   if(s+1>=str.length())
   {  return str;} 
	 if(str.charAt(s)=='h'&&str.charAt(s+1)=='i'&&str.charAt(s+2)!='t')  
	 { StringBuilder sb=new StringBuilder(str);
	    sb.delete(s, s+2);
	    sb.insert(s, "bye");
	    str= sb.toString();}
	    String sp=replace(str,s+1);
	   return sp;
	
}}