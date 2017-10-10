package ass;

import java.util.Scanner;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int j;
		int N = scn.nextInt();
		int p=N;
		for(int i=1;i<=N;i++)
		{ for( j=1;j<=i;j++)
		  { System.out.print(j+"\t");
		   }  
		for(int k=2*p-3;k>0;k--)
		{ System.out.print("\t");}
			p=p-1;
			if(i==N)
			{ j=i-1;}
			else  j=i;
		while(j>0)
		  { System.out.print(j+"\t");
		   j--;}
	System.out.println();
		}}

	}
