package dfg;

import java.util.Scanner;

public class selectionsort {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
 display(arr);
 sort(arr);
 System.out.println();
 display(arr);

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
	  public static void sort(int[]arr)
	  {  
		 for(int i=0;i<arr.length-1;i++)
		 { for(int j=i+1;j<arr.length;j++)
		 { if(arr[i]>arr[j])
		 { int temp=arr[i];
		    arr[i]=arr[j];
		    arr[j]=temp;
		 }}}
		 }
		
		 
}

