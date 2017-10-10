package Lecture5;

import java.util.Scanner;

public class ReplacingOddAndEvenCharacters {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < str.length(); i++) {
        if(i%2==0)
        {
        	char c= str.charAt(i);
        	char b=(char)(c-1);
        	sb.setCharAt(i, b);
        }
        else
        {
        	char c= str.charAt(i);
        	char b=(char)(c+1);
        	sb.setCharAt(i, b);
        }
		}
		System.out.println(sb);
	}

}
