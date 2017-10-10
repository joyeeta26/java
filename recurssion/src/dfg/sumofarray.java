package dfg;

import java.util.Scanner;

public class sumofarray {

	
	 public static Scanner scn = new Scanner(System.in);

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	 int []arr=take();
	 int []other=take();
	 
	 int []sum=calculatesum(arr,other);
	 display(sum);

	}
		public static void display(int[] arr){
			if(arr[0]!=0)
				System.out.print(arr[0]+", ");
			for(int i = 1; i < arr.length; i++){
				
				System.out.print(arr[i] + ", ");
			}
			System.out.println("END");
  }
		public static int[] take()
		{ 
			int []rv=null;
		  
		  int N =scn.nextInt();
		  rv=new int [N];
		  for(int i=0;i<N;i++)
		  { 
			   rv[i] = scn.nextInt();
		  } return rv;
		}
		public static int[] calculatesum(int[]arr,int[]other)
		{ 
			int []ty=null;
		int p=0;
		int j;
		    if(arr.length>=other.length)
		    {   int o=arr.length-other.length;
				    	ty=new int [arr.length+1];
		        int c;
		       for( j=arr.length-1;j>=0;j--)
		       {   
		    	   if(j-o>=0)
		    	   { c=arr[j]+other[j-o];}
		       else
		       {  c=arr[j];}
		           
		          ty[j+1]=c%10+p;
		            p=c/10;
		       }
		   	ty[0]=p;
		   	return ty;
			
		}
		    else
		    {   int o=other.length-arr.length;
		    	ty=new int [other.length+1];
		       for( j=other.length-1;j>=0;j--)
		       {    
		    	   int c;
		    	   if(j-o>=0)
		    	   {  c=arr[j-o]+other[j];}
		    	   else
		    	   {   c=other[j];
		    	     }
		           
		          ty[j+1]=c%10+p;
		            p=c/10;
		       }
		       		       
		    	ty[0]=p;
		   	return ty;
			
		}

		}}