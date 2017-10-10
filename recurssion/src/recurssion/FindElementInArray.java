package recurssion;

import java.util.Scanner;

public class FindElementInArray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = take();
		
	//	int si = scn.nextInt();
		int M = scn.nextInt();
		boolean b = find(arr, 0, M);
		System.out.println(b);
		

	}

	public static int[] take() {
		int[] rv = null;
		System.out.println("enter size of array");
		int N = scn.nextInt();
		rv = new int[N];
		for (int i = 0; i < N; i++) {
			System.out.println("enter" + (i) + "th element");
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	

	public static  boolean find(int[] arr, int si, int data) {
		if (si == arr.length)
		{return false;}
		       else{
			                     if (arr[si] == data) {
				                                         return true;}
			 
				 boolean b=find(arr, si + 1, data);
				 return b;
			}
			                     
		}
	
}