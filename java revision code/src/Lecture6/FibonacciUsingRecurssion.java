package Lecture6;

import java.util.Scanner;

public class FibonacciUsingRecurssion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=scn.nextInt();
   int f=fibo(n);
   System.out.println(f);
	}
  public static int fibo(int n)
  { if(n==1)
  {
	  return 1;
  }
  if(n==0)
  {
	  return 0;
  }
	  return (fibo(n-1)+fibo(n-2));
  }
}
