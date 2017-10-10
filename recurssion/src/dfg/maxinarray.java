package dfg;

import java.util.Scanner;

public class maxinarray {
	
	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
int  max=returnmax(arr);
 System.out.println(max);
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
public static int returnmax(int []other)
{ int u=other[0];
   for(int i=1;i<other.length;i++)
   { if(other[i]>u)
     { u=other[i];}
   }  return u;
   }
}



