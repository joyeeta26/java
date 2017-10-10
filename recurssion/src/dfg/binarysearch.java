package dfg;

import java.util.Scanner;

public class binarysearch {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	
 int []arr=take();
 
 sort(arr);
 int c=binary(arr);
 System.out.println(c);
 

}
	public static int[]take()
	{ 
		int []rv=null;
	  
	  int N=scn.nextInt();
	  rv=new int [N];
	  for(int i=0;i<N;i++)
	  { 
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
		 for(int i=1;i<arr.length;i++)
		 { for(int j=i;j>0;j--)
		 { if(arr[j]<arr[j-1])
		 { int temp=arr[j];
		    arr[j]=arr[j-1];
		    arr[j-1]=temp;
		 }
		 else
			 {break;}}
		 }
		
	  }
	  public static int binary(int[]arr)
	  {     int M=scn.nextInt();
		  int first,last,mid;
	  first=0;
	  last=arr.length-1;
	  while(first<=last)
	  {
	  mid=(first+last)/2;
	  if(M>arr[mid])
	  { first=mid+1;}
	  if(M<arr[mid])
	  { last=mid-1;}
	  if(M==arr[mid])
	  { return mid;}
	  }
	  return -1;
	  }

}        	  
	  
	  
	  
