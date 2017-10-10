package Lecture10;

import java.util.Scanner;

public class SlidingFibonacci {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=scn.nextInt();
 int arr[]=new int[3];
 arr[0]=0;
 arr[1]=1;
 int i=2;
 while(i<=n)
 {   
	 arr[2]=arr[0]+arr[1];
	 arr[0]=arr[1];
	 arr[1]=arr[2];
	 i++;
 }
 System.out.println(arr[2]);
	}

}
