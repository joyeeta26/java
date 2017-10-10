package Lecture2;

import java.util.Scanner;

public class CircularJailCell {
// This question is  basically a puzzle,no.s having odd no. of factors will find their door opened, and only perfect squares have odd no. of factors,therefore for input N answer will be root N.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 // no. of rounds jailer takes and no. of prisons
		 int N = scn.nextInt();
		 // on writing boolean arr[]=null,some address and space has been allocated in the heap
		 // on writing arr[]=new boolean[N+1],space in heap is divided in N+1 parts ,every block created is filled with 0 and a pointer "arr" comes in stack pointing to the address in heap
		 boolean arr[] = new boolean[N+1];
		 // initially boolean array contains "false" in its every block
		 int i=1;
		 while(i<=N)
		 { int c=1;
			 while(c<=N)
			 {if (c%i==0)
			 { 
				 arr[c]=!arr[c];
			 }
				 c++;
			 }
			 
			 
			 i++;
		 }
		 int rv=0;
		 for(int p=1;p<=N;p++)
		 { 
			 if(arr[p]==true)
			 { rv++;}
		 }
		 System.out.println(rv);
	}

}
