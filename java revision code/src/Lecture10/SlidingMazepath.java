package Lecture10;

import java.util.Arrays;
import java.util.Scanner;

public class SlidingMazepath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter row and column");
		int row=scn.nextInt();
		int col=scn.nextInt();
        int arr[]=new int[col];
       for(int i=0;i<col;i++)
       {
    	  arr[i]=1;
       }
       
       for(int t=1;t<row;t++)
       {
       
       for(int j=0;j<col-1;j++)
       {
    	   
       int temp=arr[j]+arr[j+1];
       arr[j+1]=temp;
       
       }
       
       }
      System.out.println(arr[arr.length-1]); 
       
	}

}
