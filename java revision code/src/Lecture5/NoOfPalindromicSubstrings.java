package Lecture5;

import java.util.Scanner;

public class NoOfPalindromicSubstrings {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str=scn.nextLine();
		 int sum=0;
		
		    for(int i=0;i<str.length();i++)
		    {
		    	for(int j=i+1;j<=str.length();j++)
		    	{   
		    		sum=sum+checkpalindrome(str.substring(i,j));
		    	}
		    }
		    System.out.println(sum);
	}
	public static int checkpalindrome(String s)
	{
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
			    return 0;
			}
		}
		return 1;
	}

}
