package practice;

import java.util.Scanner;

public class IsStringPallindrome {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 String str=scn.nextLine();
	Boolean b= checkPalindrome(str,0);
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
		public static Boolean checkPalindrome(String str,int si) 
		{   
			if(si==str.length()/2)
			{ return true;}
			
			if(str.charAt(si)!=str.charAt(str.length()-1-si))
			{   return false;}
			else
			{ Boolean b = checkPalindrome(str,si+1);
			   return b;
			}
		}}