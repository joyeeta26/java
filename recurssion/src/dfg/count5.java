package dfg;

import java.util.Scanner;

public class count5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no");
		int n = scn.nextInt();
		int p=0;
		while(n!=0)
		{ int rem=n%10;
		   if(rem==5)
		   { p++;}
		   n=n/10;
		}
    
    System.out.println(p);
	}

}
