package practice;

import java.util.Scanner;

public class RemoveDuplicateCharacters {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 String str=scn.nextLine();
	String s= RemoveDuplicate(str,0,str.length()-1);
	System.out.println(s);
	
	}
	
		
		public static String RemoveDuplicate(String str,int si,int li) 
		{   
			if(li==0)
			{ return str;}
			if(si==li)
			{  str=RemoveDuplicate(str,0,li-1);
				return str;}
			
			if(str.charAt(si)=='x')
			{ 
				StringBuilder sb =new StringBuilder(str);
			sb.deleteCharAt(si);
			sb.insert(si+1,'x');
				  str=sb.toString();
				  
			}
	           String s= RemoveDuplicate(str,si+1,li);
	           return s;
				}
			
			}
