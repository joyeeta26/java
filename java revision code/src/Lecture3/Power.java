package Lecture3;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter x and n to find x^n");
      int x=scn.nextInt();
      int n= scn.nextInt();
      int ans=1;
    for(int i=0;i<n;i++)
    { 
    	ans=ans*x; 
    }
    System.out.println(ans);
	}

}
