package recurssion;

import java.util.Scanner;

public class Assign6Q9 {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 int []arr=take();
	 int n =scn.nextInt();
	int b= find(arr,n,0);
	System.out.println(b);
	
	}
	
		public static int[] take()
		{ 
			int []rv=null;
		  System.out.println("enter size of array");
		  int n =scn.nextInt();
		  rv=new int [n];
		  for(int i=0;i<n;i++)
		  { System.out.println("enter" +(i)+ "th element");
			   rv[i] = scn.nextInt();
		  } return rv;
		}
		public static int find(int []arr,int no,int si) 
		{   if(si==arr.length)
		   {  return -1;}
			if(no==arr[si])
			{return si;}
			else 
			{ int b=find(arr,no,si+1);
			   return b;
			}
			
		}}