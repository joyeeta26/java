package dfg;

import java.util.Scanner;

public class ass3_q15 {

	 public static Scanner scn=new Scanner(System.in);

	  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  System.out.println("enter N1 and N2");
	  int N1=scn.nextInt();
		int N2=scn.nextInt();
		printseries(N1,N2);
		
		}
		public static void printseries(int N1,int N2)
		{ int p=0;
		int i=1;
		   while(p<N1)
		   {  
			   if((3*i+2)%N2!=0)
			   {  System.out.println(3*i+2);
			      p++;
			   }
			   i++;
		   }
		}

	}

