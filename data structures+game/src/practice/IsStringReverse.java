package practice;

import java.util.Scanner;

public class IsStringReverse {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 String str=scn.nextLine();
	 String str1=scn.nextLine();
	Boolean b= checkReverse(str,str1,0);
	System.out.println(b);
	
	}
	
		public static int[] take()
		{ 
			int []rv=null;
		  System.out.println("enter size of array");
		  int n =scn.nextInt();
		  rv=new int [n];
		  for(int i=0;i<n;i++)
		  { System.out.println("enter" +(i)+ "th element");
			   rv[i] = scn.nextInt();
		  } return rv;
		}
		public static Boolean checkReverse(String str,String str1,int si) 
		{   
			if(si==str.length())
			{ return true;}
			
			if(str.charAt(si)!=str1.charAt(str1.length()-1-si))
			{   return false;}
			else
			{ Boolean b = checkReverse(str,str1,si+1);
			   return b;
			}
		}}