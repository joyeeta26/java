package recurssion;

import java.util.Scanner;

public class IsArrayPalindrome {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 int []arr=take();
	
	Boolean b= checkPalindrome(arr,0);
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
		public static Boolean checkPalindrome(int []arr,int si) 
		{   
			if(si==arr.length/2)
			{ return true;}
			
			if(arr[si]!=arr[arr.length-1-si])
			{   return false;}
			else
			{ Boolean b = checkPalindrome(arr,si+1);
			   return b;
			}
		}}