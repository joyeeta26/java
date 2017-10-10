package Lecture6;

import java.util.Scanner;

public class PowerUsingRecursion {
 public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(" enter x and n to calculate x^n");
    int x=scn.nextInt();
    int n=scn.nextInt();
    int p=power(x,n);
    System.out.println(p);
	}
  public static int power(int x,int n)
  {  if(n==0)
  {
	  return 1;
  }
	  return x*power(x,n-1);
  }
}
