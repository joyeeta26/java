package Lecture3;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp=n;
		int ans=0;
		while(n!=0)
		{
			 int c=n%10;
			 ans=ans+c*c*c;
			 n=n/10;
		}
		if(ans==temp)
		{ System.out.println("armstrong");}
		else
		{ System.out.println(" not armstrong");}
	}

}
