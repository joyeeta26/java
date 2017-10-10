package Lecture6;

import java.util.Scanner;

public class OddDecreasingEvenIncreasing {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n= scn.nextInt();
     ODEI(n);
	}
 public static void ODEI(int n)
 {
	 if(n==0)
	 {
		 return;
	 }
	 if(n%2!=0)
	 { System.out.println(n);}
	 ODEI(n-1);
	 if(n%2==0)
	 {
		 System.out.println(n);
	 }
	 
 }
} 
