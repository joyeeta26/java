package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class equalSubsets {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		 
 int []arr=take();

       subset(arr,"",0,"",0,0);
     //  System.out.println("[");
    ArrayList<String> list=   ssubset(arr,"",0,"",0,0);
       System.out.println(list);
 
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
	
	  public static void subset(int[]arr,String s1,int sum1,String s2,int sum2,int si)
	  {  
		  if(sum1==sum2&&si==arr.length)
	       {  System.out.println("Start"+s1+" and Start"+s2);
	            return;}
	       
		  if(si>=arr.length)
		  { return;}
      
       
        
	         subset(arr,s1+", "+arr[si],sum1+arr[si],s2,sum2,si+1);
	         subset(arr,s1,sum1,s2+", "+arr[si],sum2+arr[si],si+1);
        
	  }
	  
	  
	  
	  public static ArrayList<String> ssubset(int[]arr,String s1,int sum1,String s2,int sum2,int si)
	  {  ArrayList<String> ss= new ArrayList<>();
		  if(sum1==sum2&&si==arr.length)
	        { 
			  ss.add("Start"+s1+" and Start"+s2);
			 
	            return ss;}
	       
		  if(si>=arr.length)
		  {  // ArrayList<String> baselist= new ArrayList<>();
			  return  ss;}
      
       
        
	      ss = ssubset(arr,s1+", "+arr[si],sum1+arr[si],s2,sum2,si+1);
	           ss= ssubset(arr,s1,sum1,s2+", "+arr[si],sum2+arr[si],si+1);
	      return ss;
        
	  }
	  }
		        
