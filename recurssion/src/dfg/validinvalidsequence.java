package dfg;

import java.util.Scanner;

public class validinvalidsequence {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	boolean b;
		 int N=scn.nextInt();
		
  b=true;
  int u=0;int p=0;
  for(int i=0;i<N;i++)
  {
    int d=scn.nextInt();
   
                 if(i>=1)
                         {  if(d>=u)
                           {         if(b)
                                       { p++;}
                        	 b=false;}
                           
                                 else 
                       	  {  
                                	 if(!b)
                       	    {p++;} 
                                	 b=true;}
                         }
     u=d;
  }
  
  if(p==0&&b||p==1&&!b)
  { System.out.println("true");}
  else
	  {System.out.println("false");}
  
  
 }        	  
}  