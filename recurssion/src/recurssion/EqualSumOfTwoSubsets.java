package recurssion;

import java.util.Scanner;

public class EqualSumOfTwoSubsets {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 int []arr=take();
 int c=sumarray(arr); 
 boolean b=subset(arr,c);
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
	  public static boolean subset(int[]arr,int c)
	  {   
        
	
		 int sum=0;
			
		 for(int i=0;i<arr.length;i++)
			 { sum=0; int p=i;
			 
			 while(2*sum<=c&&p<arr.length)
			 { sum=sum+arr[p];
			   if(2*sum==c)
			   { return true;
			      
			 }p++;
		    
			 }
			 }
		 return false;
	  }
                                                          
}
		        
