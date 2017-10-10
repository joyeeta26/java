package dfg;

import java.util.Scanner;

public class anytoany {
	public static void decimalconv( int n,int sb,int db)
	  { 
	  int sum=1;int rv=0;int r=0;
		  while(n!=0){
		   r=n%10;
       rv=rv+r*sum;
	    sum=sum*sb;
	    n=n/10;
	    	}
		  System.out.println(rv);
		  finalconv(rv,db);
	  
	  }
	public static void finalconv(int rv,int db)
	{ int sum=1;int ft=0;int r=0;
	  while(rv!=0){
		   r=rv%db;
      ft=ft+r*sum;
	    sum=sum*10;
	    rv=rv/db;}
	    System.out.println(ft);}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
	System.out.println("enter no");
	int n = scn.nextInt();

	System.out.println("enter base in which the no is");
			int sb = scn.nextInt();
			System.out.println("enter nbase in which it is to be converted");
			int db = scn.nextInt();

			decimalconv(n,sb,db);
			
		}

	}


