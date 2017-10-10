package Lecture10;

import java.util.Scanner;

public class DPCountMazePath {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("enter row and col");
    int row =scn.nextInt();
    int col=scn.nextInt();
    int arr[][]=new int[row][col];
    System.out.println(countMP(0,row-1,0,col-1,arr));
	}
public static int countMP(int cr,int er,int cc,int ec,int[][]arr)
{  
	if(cr==er&&cc==ec)
	{
		return 1;
	}
	int a=0,b=0;
	if(cr<er)
	{  if(arr[cr+1][cc]!=0)
	{
		a=arr[cr+1][cc];
	}  else
		{a=countMP(cr+1,er,cc,ec,arr);}
	}
	if(cc<ec)
	{  if(arr[cr][cc+1]!=0)
	{
		b=arr[cr][cc+1];
	}  else{
	 b=countMP(cr,er,cc+1,ec,arr);
	}
	}
	arr[cr][cc]=a+b;
	return a+b;
	
}
}
