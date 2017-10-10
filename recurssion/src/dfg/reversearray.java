package dfg;

import java.util.Scanner;

public class reversearray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
 display(arr);
  reverse(arr);
display(arr);
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
public static void reverse(int []other)
{  for(int i=0;i<other.length/2;i++)
{  int temp =  other[i];
		other[i]=other[other.length-1-i];
other[other.length-1-i]=temp;
}
}
}


