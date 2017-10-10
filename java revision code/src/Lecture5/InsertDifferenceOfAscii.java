package Lecture5;

import java.util.Scanner;

public class InsertDifferenceOfAscii {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length()-1; i++) 
		{
			char curr=str.charAt(i);
			char next=str.charAt(i+1);
			int a=next-curr;
			sb.append(curr);
			sb.append(a);
		}
		
	sb.append(str.charAt(str.length()-1));
	System.out.println(sb);
	
	}}