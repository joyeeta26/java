package Lecture3;

import java.util.Scanner;

public class IsMirroInverse {
// no is mirror inverse if inverse of that no. is equal to no. itself
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int temp=n;
		int c=1;
		int ans=0;
		while(n!=0)
		{ int p=n%10;
		 ans =ans+c*(int)Math.pow(10,p-1);
		   c++;
		n=n/10;
		}
		if(ans==temp)
		{System.out.println("no. is mirror inverse");}
		
		else
		{System.out.println("no. is not mirror inverse");}
		
	}

}
