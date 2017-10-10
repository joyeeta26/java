package dfg;

import java.util.Scanner;

public class printarrayrowwise {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	                                         int [][]arr=take();
	                                       
                                             display(arr);
                                           }
	public static int[][]take()
	{ 
		int [][]rv=null;
	  
	  int N=scn.nextInt();
	  int M=scn.nextInt();
	  rv=new int [N][M];
	  for(int i=0;i<N;i++)
	  {   for(int j=0;j<M;j++)
	     { rv[i][j] = scn.nextInt();}
	  } 
	  return rv;
	}
	public static void display(int[][] arr){
		 int i=0;
		 int j=0;
		while(i<arr.length)
		{  
			System.out.print(arr[i][j]);
		  if(i%2==0)
		  { j++;}
		  else if(i%2!=0)
		  {j--;}
		  if(j==arr[0].length-1)
		  { System.out.print(arr[i][j]);
		  i++;}
		  if(j==0)
		  {System.out.print(arr[i][j]);
		  i++;}
		  }
	}}
		
		
		
	
	
	  