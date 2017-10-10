package Lecture3;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter 2 nos");
   int a=scn.nextInt();
   int b= scn.nextInt();
   int dividend=Math.max(a, b);
   int divisor=Math.min(a, b);
   int gcd=1;
   while(true)
   { int rem=dividend%divisor;
     if(rem==0)
     {  gcd=divisor;
     break;}
    dividend=divisor;
    divisor=rem;
    	  
     }
	   
   System.out.println(gcd);
	}

}
