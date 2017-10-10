package Lecture5;

import java.util.Scanner;
                                                           //if s=This is a book
public class AllCharactersOfStringInDifferentLines {      //using .... String s=scn.next(); s=This
	public static Scanner scn = new Scanner(System.in);  //using this...String s=scn.nextLine(); s=This is a book
	public static void main(String[] args) {            // but when we take string as well as integer input,use String s=scn.next();
		// TODO Auto-generated method stub
        String str=scn.nextLine();
      for(int i=0;i<str.length();i++)   // str.length() is an inbuilt function therefore we use ()at the end of it,
    	                                //but arr.length is not a function,therefore we do not use () at the end of it.
      {
    	  System.out.println(str.charAt(i));
      }
	}

}
