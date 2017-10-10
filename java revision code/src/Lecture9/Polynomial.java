package Lecture9;

import java.util.Scanner;

public class Polynomial {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int x=scn.nextInt();
  int n=scn.nextInt();
  System.out.println(polynomial(x,n));
	}
public static int polynomial(int x,int n)
{   int sum=0;
	int p=x;
	while(n>=1)
	{ 
		sum=sum+n*x;
		n--;
		x=x*p;
	}
	return sum;
}
}
