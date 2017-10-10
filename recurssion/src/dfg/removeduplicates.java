package dfg;

import java.util.Scanner;

public class removeduplicates {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
		int l=str.length();
	
		int prev=0;int c=1;
		for(int i=1;i<l;i++)
		{ int next =i;
		  if(str.charAt(prev)!=str.charAt(next))
				  { 
			  System.out.print(str.charAt(prev));
			  if(c!=1)
			  {  System.out.print(c);}
			  c=1;}
		   
		  else if(str.charAt(prev)==str.charAt(next))
		  {c++;}
  
  
		  prev=next;
		}
		System.out.print(str.charAt(l-1));
		 if(c!=1)
		  {  System.out.print(c);}
	}

}
