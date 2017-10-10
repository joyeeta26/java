package recurssion;

import java.util.Scanner;

public class isequaldivisionposs {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 int []arr=take();

 boolean b=subset(arr,0,0,0);
 System.out.println(b);

}
	public static int sumarray(int []arr)
	{ int i=0;int sum=0;
		while( i<arr.length)
		{  sum=sum+arr[i];
		i++;
		}
		return sum;
	}
	public static int[] take()
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
	  public static boolean subset(int[]arr,int si,int g1,int g2)
	  {   
        if(si==arr.length)
        { if(g1==g2)
        	  return true;
        else return false;
        }
	boolean b=subset(arr,si+1,g1+arr[si],g2);
	boolean  b1=subset(arr,si+1,g1,g2+arr[si]);
	 if(b||b1)
		 return true;
	  
	  else return false;}                                                
}
		        

