package dfg;

import java.util.Scanner;

public class string {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S1 = scn.nextLine();
		
		makesubstring(S1);
		

	}

	public static void makesubstring(String S1) {
		int si = 0, ls = S1.length();
		for (int i = 0; i < S1.length(); i++) {
			for (int j =i+1; j <= S1.length(); j++) {
			             String S2=S1.substring(i, j);
			              
		//boolean b=Ispalindrome(S2);
		//	if(b==true)
			System.out.println(S2);
			}}
		
	}
	public static boolean Ispalindrome(String S2)
	{ int left=0,right=S2.length()-1;
	   while(left<right)
	   {  if(S2.charAt(left)==S2.charAt(right))
	    
	   { 
	     left++;
	     right--;
	   }
	   else{return false;}
	}
	   return true;
}}