package Lecture10;

import java.util.Scanner;

public class SlidingCountBoardPath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter end");
        int n=scn.nextInt();
        int arr[]=new int[6];
        arr[0]=1;
        
        for(int i=1;i<=n;i++)
        {
        	if(i<=5)
        	{  for(int l=0;l<=i-1;l++)
        		{
        		   arr[i]=arr[i]+arr[l];
        		}
        	}
        	else{ int a=0;
        		for(int l=0;l<=5;l++){
        			
        		
        		 a=a+arr[l];
        		}
        		arr[0]=arr[1];
        		arr[1]=arr[2];
        		arr[2]=arr[3];
        		arr[3]=arr[4];
        		arr[4]=arr[5];
        		arr[5]=a;
        	}
        }
        System.out.println(arr[5]);
	}

}
