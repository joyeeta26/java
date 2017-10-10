package Lecture5;

import java.util.Scanner;
// substring is different from subsets
// if length of string is n,then total substrings is (n*n+1)/2
public class SubstringsOfString {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str=scn.nextLine();
    for(int i=0;i<str.length();i++)
    {
    	for(int j=i+1;j<=str.length();j++)
    	{
    		System.out.println(str.substring(i,j));
    	}
    }
	}

}
