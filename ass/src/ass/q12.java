package ass;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	
		int N = scn.nextInt();
		for(int i=1;i<=N;i++)
		{    
		
			for(int k=1;k<=N-i;k++)
		     { System.out.print("\t");  
		       }
		for(int r=i;r<=2*i-1;r++)
		{ System.out.print(r+"\t");} 
		for(int y=2*i-2;y>=i;y--)
		{ System.out.print(y+"\t");}
		
		System.out.println();}
		
	for(int i=N;i>1;i--)
	{ 
		for(int k=N-i+1;k>0;k--)
	     { System.out.print("\t");  
	       } int p=i;
	for(int r=p-1;r<=2*p-3;r++)
	{ System.out.print(r+"\t");
	} p--;
	for(int y=2*i-4;y>=i-1;y--)
	{ System.out.print(y+"\t");}
	System.out.println();}
	

}}
