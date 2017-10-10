package dfg;

import java.util.Scanner;
 
public class gcdthrofunc {
	 public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter both nos");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=gcd(a,b);
		System.out.println(c);
		

	}
	public static int gcd(int a,int b)
	{  int r;
	   while(b!=0)
	   { r=a%b;
	      a=b;
	      b=r;
	      
	   }
	   return a;
	}

}
