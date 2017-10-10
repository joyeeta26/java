package dfg;

import java.util.Scanner;

public class lcmthrofunc {

	 public static Scanner scn=new Scanner(System.in);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter both nos");
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c= lcm(a,b);
			System.out.println(c);
			

		}
		public static int lcm(int a,int b)
		{   int h=a;
		   int k=b;
			int r;
		   while(b!=0)
		   { r=a%b;
		      a=b;
		      b=r;
		      
		   }
		   int p=(h*k)/a;
		   return p;
		}

	}