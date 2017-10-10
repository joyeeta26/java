package Lecture7;

import java.util.Scanner;

public class Printboardpath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter end");
     int end=scn.nextInt();
     printboardpath(0,end,"");
	}
public static void printboardpath(int curr,int end,String ans)
{
	if(curr>end)
	{
		return;
	}
	if(curr==end)
	{
		System.out.println(ans);
		return;
	}
	
	
	
	for(int dice=1;dice<=6;dice++)
	{
	     printboardpath(curr+dice,end,ans+dice);

	}
}
}
