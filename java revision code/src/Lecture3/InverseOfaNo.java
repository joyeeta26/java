package Lecture3;

import java.util.Scanner;
//Inverse is different from reverse .ex. inverse of 312 is 312 , 2 is on 1st position therefore 1 will be on 2nd position
public class InverseOfaNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c=1;
		int ans=0;
		while(n!=0)
		{ int p=n%10;
		 ans =ans+c*(int)Math.pow(10,p-1);
		   c++;
		n=n/10;
		}
		System.out.println("inverse of no. is"+ans);
	}

}
