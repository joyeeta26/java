package recurssion;

import java.util.Scanner;

public class SumOfNnumbers {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = scn.nextInt();
		
		int c=pascaltriangle(N);
		System.out.println(c);
	}

	public static int pascaltriangle (int n) {
	   
		if(n==1)
		{ return 1 ;}
		
		int sum=pascaltriangle(n-1);
         sum=sum+n;
         return sum;
	}
}
