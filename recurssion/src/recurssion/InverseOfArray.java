package recurssion;

import java.util.Scanner;

public class InverseOfArray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	 int []arr=take();
	
	int rv[]= Inverse(arr,0);
	display(rv);
	
	}
	public static void display(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
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
		public static int[] Inverse(int []arr,int si) 
		{  
			if(si==arr.length/2)
			{ return  arr;}
					
			int temp=arr[si];
			arr[si]=arr[arr.length-si-1];
			arr[arr.length-si-1]=temp;
			Inverse(arr,si+1);
			return arr;
		}}