package dfg;

import java.util.Scanner;

public class bintodec {

 
		 public static int decbin( int d)
		  { 
		  int sum=1;int rv=0;int r=0;
			  while(d!=0){
			   r=d%10;
				  
		    rv=rv+r*sum;
		    sum=sum*2;
		    d=d/10;
		    	}
			  return rv;
		  
		  }
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scn = new Scanner(System.in);
		System.out.println("enter");
				int n = scn.nextInt();
				int c=decbin(n);
				System.out.println(c);
			}

		}
