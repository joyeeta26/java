package dfg;

import java.util.Scanner;

public class logthrofunc {
	 public static Scanner scn=new Scanner(System.in);

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("enter x and n");
  int x=scn.nextInt();
	int n=scn.nextInt();
	int c=log(x,n);
	System.out.println(c);
	}
	public static int log(int x,int n)
	{ int p=0;
		while(x!=1)
      	{  x=x/n;
      	   p++;
      	}
		return p;
	}

}
