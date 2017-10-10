package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class targetSum {
	public static  Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
	
		ArrayList<Integer>rv =take();
		int t= scn.nextInt();
     taarget(rv,t,"",-1);
      
	}
  
	public static ArrayList<Integer> take()
	{ 
		ArrayList<Integer> list =new ArrayList<>();
	  System.out.println("enter size of array");
	  int n =scn.nextInt();
	 
	  for(int i=0;i<n;i++)
	  { System.out.println("enter" +(i)+ "th element");
		   int u = scn.nextInt();
		   list.add(u);
	  } return list;
	}
//	public static  ArrayList<ArrayList<Integer>> target(int [] arr)
//	{ 
//		for(int i=0;i<arr.length;i++)
//		{ 
//		
//		
//	}
//	}
	public static void taarget(ArrayList<Integer> arr,int target,String osf,int t)
	{   
		if(target<0)
		{ return;}
		if(target==0)
		{  System.out.println(osf+"END");
		  return;
		}
		for(int i=t+1;i<arr.size();i++)
		{ int c= arr.get(i);
		  taarget(arr,target-c,osf+c+", ",i);
		 
		}
		
	}
}
