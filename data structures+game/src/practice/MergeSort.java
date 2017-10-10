package practice;

import java.util.Scanner;

public class MergeSort {

	
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
 int[]p=sort(arr,0,arr.length-1);
	
	for(int  val:p)
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
  public static int[] mergearray(int []one,int []other)
  {   int []rv=new int[one.length+other.length];
     int i=0;int j=0;int k=0;       
  
  while(i<one.length&&j<other.length)
  {   if(one[i]<=other[j])
  {  rv[k]=one[i];
    i++;
    k++;
  }
  else
  { rv[k]=other[j];
  j++;
  k++;
}}
  while(i<one.length)
  { rv[k]=one[i];
  i++;
  k++;}
  while(j<other.length)
  {rv[k]=other[j];
  j++;
  k++;}
   return rv;
  }
  public static int []sort(int []arp,int left,int right )
  {  if(left==right)
  {  int rv[]=new int[1];
     rv[0]=arp[left];
      return rv;
  }
  int mid=(left+right)/2;
     int fhalf[]=sort(arp,left,mid);
     int shalf[]=sort(arp,mid+1,right);
     int result[]=mergearray(fhalf,shalf);
     return result;
  
  
  }
  }