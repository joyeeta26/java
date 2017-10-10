package Lecture3;

import java.util.Scanner;

public class allArmstrongFrom100to999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(int i=101;i<999;i++)
		
		{ int temp=i;
		  int ans=0;
		
		while(temp!=0)
		{
			 int c=temp%10;
			 ans=ans+c*c*c;
			 temp=temp/10;
		}
		if(ans==i)
		{ System.out.println(i);}
		}
	}

}
