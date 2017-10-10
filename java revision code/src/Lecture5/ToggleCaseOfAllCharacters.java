package Lecture5;

import java.util.Scanner;

public class ToggleCaseOfAllCharacters {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str= scn.nextLine();
   // we cannot change characters in a string,therefore we would have to make a new string and add each character to it thro a loop
   // to reduce time and space complexity use stringbuilder instead of string
   StringBuilder sb = new StringBuilder(str);
   for(int i=0;i<sb.length();i++)
   {
	   char c= sb.charAt(i);
	   if(c>=65&&c<=90)
	   {
		   char b=(char)(c+32);
		sb.setCharAt(i, b);
	   }
	   else if(c>=97&&c<=122)
	   {
		   char b=(char)(c-32);
			sb.setCharAt(i, b);
	   }
   }
   System.out.println(sb);
	}

}
