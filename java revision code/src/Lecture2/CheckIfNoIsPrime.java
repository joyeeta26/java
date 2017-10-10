package Lecture2;

import java.util.Scanner;

public class CheckIfNoIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int i=2;
    while(i<=N/2)
    { if(N%i==0)
       {  
    	System.out.println("no is not prime");
    	 return;}
    i++;
    }
    System.out.println("no is prime");
	}

}
