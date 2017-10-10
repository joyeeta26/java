package recurssion;

import java.util.Scanner;

public class SearchUsingRecurssion {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 int []arr=take();
	 int M =scn.nextInt();
	int b= find(arr,M,arr.length-1);
	System.out.println(b);
	
	}
	
		public static int[] take()
		{ 
			int []rv=null;
		  System.out.println("enter size of array");
		  int N =scn.nextInt();
		  rv=new int [N];
		  for(int i=0;i<N;i++)
		  { System.out.println("enter" +(i)+ "th element");
			   rv[i] = scn.nextInt();
		  } return rv;
		}
		public static int find(int []arr,int no,int si) 
		{   if(si<0)
		   {  return -1;}
			if(no==arr[si])
			{return si;}
			else 
			{ int b=find(arr,no,si-1);
			   return b;
			}
			
		}
}