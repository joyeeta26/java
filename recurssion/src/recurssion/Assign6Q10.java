package recurssion;

import java.util.Scanner;

public class Assign6Q10 {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 int []arr=take();
	 int M =scn.nextInt();
	int rv[]= find(arr,M,0,0);
	if(rv.length==0)
		{ System.out.println(-1);}
	else display(rv);
	
	}
	public static void display(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
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
		public static int[] find(int []arr,int no,int si,int c) 
		{   
			if(si==arr.length)
			{ int newarr[]=new int[c];
			   return newarr;
			}
			if(arr[si]==no)
			{  
			int rv[]= find(arr,no,si+1,c+1);
		  	rv[c]=si;
		  	return rv;
			}
			int rv[]= find(arr,no,si+1,c);
			return rv;
		}}