package recurssion;

import java.util.Scanner;

public class repeatitionsinarray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = take();

		int si = scn.nextInt();
		int data = scn.nextInt();
		int fsf=0;
		int[] rv  = index(arr, si,data,fsf);
		display(rv);

	}
	public static void display(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}}
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

	public static int[] index(int[] arr, int si,int data,int fsf) {
		
		
		if(si==arr.length)
		{   int []rv=null;
			 rv= new int[fsf];
			 return rv;
			}
		
		if (arr[si] == data) {
			int[]rv=index(arr,si+1,data,fsf+1);
			rv[fsf]=si;
			return rv;
		}
		else 
			
			{int[]rv=index(arr,si+1,data,fsf);
			return rv;}
	
}}