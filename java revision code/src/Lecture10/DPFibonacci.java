package Lecture10;

import java.util.Scanner;

public class DPFibonacci {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int arr[]=new int[N+1];
		System.out.println(fibo(N,arr));
		
	}

	public static int fibo(int n,int[]arr) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}
		int a,b=0;
		if(arr[n-1]!=0)
		{  a=arr[n-1];
		  
		}
		else{
		 a = fibo(n - 1,arr);}
		
		if(arr[n-2]!=0)
		{ b=arr[n-2];
		  
		}
		else{
		 b = fibo(n - 2,arr);}
		
		arr[n]= a+b;
		return a + b;
	}
}
