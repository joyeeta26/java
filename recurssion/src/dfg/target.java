package dfg;

import java.util.Scanner;

public class target {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
 display(arr);
 System.out.println("enter target no");
 int t =scn.nextInt();
  target(arr,t);
  

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
public static void display(int[] arr){
	for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] + ", ");
	}

}
public static void target(int []other,int t)
{  
	for(int i=0;i<other.length;i++)

{   int c=t-other[i];
   for(int j=i+1;j<other.length;j++)
   { if(c==other[j])
   { System.out.println(other[i]+" "+c);}
   }
    
}
}
}


