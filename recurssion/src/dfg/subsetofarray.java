package dfg;

import java.util.Scanner;

public class subsetofarray {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 int []arr=take();
 
 subset(arr);
 

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
	  public static void subset(int[]arr)
	  {   int p=(int)Math.pow(2, arr.length)-1;
         System.out.println("[]");
		 for(int i=1;i<=p;i++)
		 {    int u=0;
              System.out.print("[");
			  int y=i;
			                       while(y!=0) {
			                                          for(int j=0;j<arr.length;j++)
		                                             { 
		    
		                                               int t=y%2;
                                                             if(t==1&&u==1)
		                                                   {   
                                                                System.out.print(", "+arr[j]);}
		                                                     
			                                          
			                                           if(t==1&&u==0)
		                                                   {    u=1;
                                                                System.out.print(arr[j]);
                                                           }
		    
		    
                                                          
                                                        y=y/2;
		                                          }
			          System.out.print("]");
         
		 System.out.println();
         }
		 
      }}}
