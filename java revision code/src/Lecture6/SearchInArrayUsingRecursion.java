package Lecture6;

import java.util.Scanner;

public class SearchInArrayUsingRecursion {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]=takeinput();
        System.out.println("enter element to be searched");
        int element =scn.nextInt();
		boolean b = ispresent(arr, element,0,arr.length-1);
		System.out.println(b);
	}

	public static int[] takeinput() {
		System.out.println("enter size of array");
		int N = scn.nextInt();
		int rv[] = new int[N];
		for (int i = 0; i < N; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}
  public static boolean ispresent(int [] arr,int element,int si,int li)
  {  
	  if(si>li)
	  {
		  return false;
	  }
	  if(arr[si]==element||ispresent(arr,element,si+1,li))
	  {
		  return true;
	  }
	  else{ return false;}
  }
}
