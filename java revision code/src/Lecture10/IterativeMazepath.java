package Lecture10;

import java.util.Scanner;

public class IterativeMazepath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter row and col");
		int row=scn.nextInt();
		int col=scn.nextInt();
		int arr[][]=new int [row][col];
		for(int i=0;i<row;i++)
		{
			arr[i][col-1]=1;
		}
		for(int i=0;i<col;i++)
		{
			arr[row-1][i]=1;
		}
      
		for(int i=row-2;i>=0;i--)
		{
			for(int j=col-2;j>=0;j--)
			{
				arr[i][j]=arr[i+1][j]+arr[i][j+1];
			}
		}
		
		System.out.println(arr[0][0]);
		
	}

}
