package Lecture10;

import java.util.Scanner;

public class IterativeCountBoardPath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("enter end");
   int n=scn.nextInt();
   int arr[]=new int[n+1];
   arr[n]=1;
   for(int i=n-1;i>=0;i--)
   {
	   for(int j=1;j<=6;j++)
	   {  if(i+j>n)
	     {
		   break;
	     }
		   arr[i]=arr[i]+arr[i+j];
	   }
   }
   System.out.println(arr[0]);
	}

}
