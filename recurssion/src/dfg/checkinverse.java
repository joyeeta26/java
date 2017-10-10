package dfg;

import java.util.Scanner;

public class checkinverse {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("for first array");

		int[] arr = take();
		System.out.println("for second array");
		int[] other = take();

		boolean b ;
		b=inverse(arr,other);
		System.out.println(b);
		display(other);

	}

	public static int[] take() {
		int[] rv = null;
		System.out.println("enter size of array");
		int n = scn.nextInt();
		rv = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter" + (i) + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static boolean inverse(int[]arr,int []other)
	  {   
	      
	     for(int i=0;i<arr.length;i++)
	     {  int c=arr[i];
	    	 if(other[c]!=i)
	    	 { return false;
	    	     }
	    	 
	     }
		return true;
		
	  }
}
