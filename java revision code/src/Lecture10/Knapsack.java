package Lecture10;

import java.util.Scanner;

public class Knapsack {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  System.out.println("enter weight array");
  int[] weight=takeinput();
  System.out.println("enter value array");
  int[] value=takeinput();
  System.out.println("enter max weight");
  int maxwt=scn.nextInt();
  int maxvalue=KS(weight,value,0,0,maxwt);
  System.out.println(maxvalue);
	}
  public static int[] takeinput()
  {   
	  System.out.println("enter size of array");
	 
	  int rv[]=new int[scn.nextInt()];
	  for(int i=0;i<rv.length;i++)
	  {
		  rv[i]=scn.nextInt();
	  }
	  return rv;
  }
  public static int KS(int [] weight,int [] value,int si,int vsf,int remcapacity)
  {  if(si==value.length||remcapacity<=0)
    {
	  return vsf;
    }
  
	  int t1=KS(weight,value,si+1,vsf+value[si],remcapacity-weight[si]); //included
	  int t2=KS(weight,value,si+1,vsf,remcapacity);//not included
	  return Math.max(t1, t2);
  }
}
