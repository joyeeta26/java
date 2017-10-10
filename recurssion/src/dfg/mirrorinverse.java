package dfg;

import java.util.Scanner;

public class mirrorinverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no");
		int n = scn.nextInt();
		int p=1;
		int sum=0;
		int y=n;
		while(n!=0)
		{ int rem=n%10;
		 sum=sum +p* ((int)Math.pow(10,rem-1));
		 p++;
		 n=n/10;
		}
		System.out.println(sum);
		if(sum==y)
		{ System.out.println("no is mirror inverse");}
		else
		{ System.out.println("no is not mirror inverse");}

	}

}
