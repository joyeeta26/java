package ass;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		int a=0; int b=1; int c;
		for(int i=1;i<=N;i++)
		{ for(int j=1;j<=i;j++)
		{ System.out.print(a+"\t");
		  c=a+b;
		  a=b;b=c;
		}
		System.out.println();}
	}
}
	


