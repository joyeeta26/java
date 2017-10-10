package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class InvertingAnArray {

	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
  invert(arr,0);
  for(int val:arr)
  { System.out.print(val+"\t");
	}
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
  } return rv;
}
public static void invert(int []arr,int si)
{  if(si==arr.length)
  { return;}

	int temp=arr[si];
	invert(arr,si+1);
arr[temp]=si;
return;
}
}


