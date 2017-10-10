package practice;

import java.util.Scanner;

public class QuickSort {


	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
 sort(arr,0,arr.length-1);
	
	for(int  val:arr)
	{ System.out.println(val);}
	
	
}
	public static int[] take()
	{ Scanner scn = new Scanner(System.in);
		int []rv=null;
	  System.out.println("enter size of array");
	  int n =scn.nextInt();
	  rv=new int [n];
	  for(int i=0;i<n;i++)
	  { System.out.println("enter" +(i)+ "th element");
		   rv[i] = scn.nextInt();
	  } return rv;}
 
  public static void sort(int []arr,int lo,int hi )
  { 
	  if(lo>=hi)
  {  
      return ;
  }
    int mid=(lo+hi)/2;
    int pivot= arr[mid];
    int left=lo;
    int right=hi;
    while(left<=right){
    while(arr[left]<pivot)
    { left++;}
   
    while(arr[right]>pivot)
    { right--;}
    //if(left<=right)
    {  int temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
       left++;
       right--;}
  }
    sort(arr,lo,right);
    sort(arr,left,hi);
    }
  
 }