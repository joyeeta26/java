package Lecture9;

import java.util.Scanner;

public class SieveOfErasthosthenes {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n= scn.nextInt();
   boolean sieve[]=new boolean [n+1];
   for(int i=0;i<=n;i++)
   {
	   sieve[i]=true;
   }
	for(int i=2;i*i<=n;i++)
	{
		if(sieve[i]==true)
		{
			for(int p=2;p*i<=n;p++)
			{
				sieve[p*i]=false;
			}
		}
	}
	
	for(int p=2;p<=n;p++)
	{
		if(sieve[p]==true)
		{
			System.out.println(p);
		}
	}
	
	}

}
