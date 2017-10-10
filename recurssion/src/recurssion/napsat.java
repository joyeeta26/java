package recurssion;

import java.util.Scanner;

public class napsat {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int weigth[] = takeInput();
		int  value[]=takeInput();
		 int c=knapsnack(weigth,value,35,0,0);
		System.out.println(c);
		
	}
		public static int[] takeInput(){
			int[] rv = null;
			
			System.out.println("Enter the size of array");
			int n = scn.nextInt();
			
			rv = new int[n];
			for(int i = 0; i < rv.length; i++){
				System.out.println("Enter the value of " + (i) + "th element");
				rv[i] = scn.nextInt();
			}
			
			
			return rv;
		}
		public static int knapsnack(int weight[],int value[],int remcapacity,int vsf,int si)
		{    if(si==value.length)
		       { return vsf;}
              
			 int notincludedvalue=knapsnack(weight, value, remcapacity,vsf, si+1);
			 int includedvalue=0;
			if(remcapacity-weight[si]>=0)
			{   includedvalue=knapsnack(weight, value, remcapacity-weight[si],vsf+value[si], si+1);}
			int rv=Math.max(notincludedvalue, includedvalue);
			return rv;
		}
	}

