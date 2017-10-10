package Lecture10;

import java.util.Scanner;

public class IterativeFibonacci {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=scn.nextInt();
   int arr[]=new int[n+1];
   arr[0]=0;
   arr[1]=1;
   for(int i=2;i<=n;i++)
   {
	   arr[i]=arr[i-1]+arr[i-2];
   }
   System.out.println(arr[n]);
	}

}
