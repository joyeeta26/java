package dfg;

import java.util.Scanner;

public class dectoany {
	public static int decbin( int d,int b)
	  { 
	  int sum=1;int rv=0;int r=0;
		  while(d!=0){
		   r=d%b;
			  
	    rv=rv+r*sum;
	    sum=sum*10;
	    d=d/b;
	    	}
		  return rv;
	  
	  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
	System.out.println("enter no");
	int n = scn.nextInt();

	System.out.println("enter base");
			int b = scn.nextInt();
			int c=decbin(n,b);
			System.out.println(c);
		}

	}


