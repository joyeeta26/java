package Lecture6;

import java.util.Scanner;

public class PrintIncreaingAndDecreasingUsingRecursion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n =scn.nextInt();
    printincreasing(n);
    printdecreasing(n);
    printdecreasingincreasing(n);
	}
public static void  printincreasing(int n)
{  
	if(n==0)
	{
		return;
	}
	 printincreasing(n-1);
	 System.out.println(n);
}
public static void  printdecreasing(int n)
{  
	if(n==0)
	{
		return;
	}
	 System.out.println(n);
	 printdecreasing(n-1);
	
}
public static void  printdecreasingincreasing(int n)
{  
	if(n==0)
	{
		return;
	}
	System.out.println(n);
	 printdecreasingincreasing(n-1);
	 if(n!=1)
	 {System.out.println(n);}
	 
}
}
