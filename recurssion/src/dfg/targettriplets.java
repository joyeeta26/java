 package dfg;

import java.util.Scanner;

public class targettriplets {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jk";
		String s2="il";
		String s3=s1+s2;
		
 int []arr=take();
 sort(arr);
 System.out.println("enter target no");
 int t =scn.nextInt();
 for(int i=0;i<arr.length;i++)
 {   int y=t-arr[i];
    target(arr,y,t,i);
 }

	}

public static int[] take()
{ 
	int []rv=null;
  System.out.println("enter size of array");
  int n =scn.nextInt();
  rv=new int [n];
  for(int i=0;i<n;i++)
  { System.out.println("enter" +(i)+ "th element");
	   rv[i] = scn.nextInt();
  } return rv;


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
public static void target(int []other,int y,int t,int p)
{  
	for(int i=p+1;i<other.length;i++)

{   int c=y-other[i];
   for(int j=i+1;j<other.length;j++)
   { if(c==other[j])
   { System.out.println(other[p]+" "+other[i]+" "+c);}
   }
    
}
}
}

