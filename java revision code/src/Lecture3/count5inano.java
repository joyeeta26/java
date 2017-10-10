package Lecture3;

import java.util.Scanner;

public class count5inano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" enter a no.");
		int N=scn.nextInt();
		int count =0;
		while(N!=0)
		{ int c=N%10;
		  if(c==5)
		  { count++;}
		N=N/10;
		}
		System.out.println("toyal 5s are"+count);
	}

}
