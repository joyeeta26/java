package ass;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		for (int i = 1; i <= N / 2 + 1; i++) {
			for (int j = N / 2 - i + 1; j >= 0; j--) {
				System.out.print("*\t");
			}
			for (int w = 1; w <= 2 * i - 1; w++) {
				System.out.print(" \t");
			}
			for (int j = N / 2 - i + 1; j >= 0; j--) {
				System.out.print("*\t");
			}
			System.out.println(); 
		

		}
		   for(int k=1;k<=N/2;k++)
		   { for(int r=0;r<=k;r++)
		     { System.out.print("*\t");}
		   
		      for(int w=N-2;w>=(2*k)-1;w=w-1)
		      { System.out.print(" \t");
		   }
		      for(int r=0;r<=k;r++)
			     { System.out.print("*\t");}
		      System.out.println();

	}
	}}
