package Lecture9;

import java.util.Scanner;

public class PowerUsingLessTime {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("enter x and n to find x^n");
		   int x=scn.nextInt();
		   int n=scn.nextInt();
		   int p=x*x;
		   int c=n/2;
		   for(int u=1;u<c;u++)
		   {
			   p=p*x*x;
		   }
		   if(n%2==0)
		   {
			   System.out.println(p);
		   }
		   else{
			   System.out.println(p*x);
		   }
			}

		}
