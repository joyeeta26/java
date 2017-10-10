package Lecture3;

import java.util.Scanner;

public class dectooct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scn = new Scanner(System.in);
  System.out.println("enter decimal form");
  int N = scn.nextInt();
  int c=1;
  int ans=0;
  while(N!=0)
  {
	  int p=N%8;
	  ans=ans+p*c;
	  c=c*10;
	  N=N/8;
  }
  System.out.println("octal form is "+ans);
	}

}
