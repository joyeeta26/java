package Lecture4;

import java.util.Scanner;

public class BasicOfArray {
 public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 int arr[]=takeinput();
		 display(arr);
         max(arr);
	}
 public static int[] takeinput()
 {
	 System.out.println("enter size of array");
	 int N = scn.nextInt();
	 int rv[]=new int[N];
	 for(int i=0;i<N;i++)
	 {
		 rv[i]=scn.nextInt();
	 }
	 return rv;
 }
 public static void display(int []arr)
 {
	
	 for(int i=0;i<arr.length;i++)
	 {
		System.out.print(arr[i]+" "); 
	 }
	
 }
 public static void max(int [] arr)
 {
	 int max=Integer.MIN_VALUE;
	 for(int i=0;i<arr.length;i++)
	 {
		 if(arr[i]>max)
		 {
			 max=arr[i];
		 }
	 }
	 System.out.println("max is"+ max);
 }
 
 
 
 
 
 
}
