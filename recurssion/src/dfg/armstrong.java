package dfg;

import java.util.Scanner;

public class armstrong {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no");
		int n = scn.nextInt();
		int r=n;int sum=0;
		while(n!=0)
		{ int rem=n%10;
		  sum=sum+rem*rem*rem;
		  n=n/10;
		}
		if(r==sum)
		{ System.out.println("no is armstrong");}
		else { System.out.println("not armstrong");}

	}

}
