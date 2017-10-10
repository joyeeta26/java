package dfg;

import java.util.Scanner;

public class inverseofarray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 int []arr=take();
 display(arr);
 int[]other=getinverse(arr);
 display(other);

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
	public static void display(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
}
	  public static int[] getinverse(int[]arr)
	  {  int[]rv=null;
	    rv=new int [arr.length];
	  
	     for(int i=0;i<arr.length;i++)
	     {   int c=arr[i];
	    	 rv[c]=i;
	     }
	     return rv;
}}


	