package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfArray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> arr;
		 arr=take();
	
	ArrayList<Integer> br = new ArrayList<>();
	
	permute(arr,br);
}
	
	public static ArrayList<Integer>  take()
	{ 
		ArrayList<Integer> rv = new ArrayList<>();
	    System.out.println("enter size of array");
	    int n =scn.nextInt();
	  
	  for(int i=0;i<n;i++)
	  { System.out.println("enter" +(i)+ "th element");
		   int y=  scn.nextInt();
		   rv.add(y);
	  } return rv;
	}
	public static void permute(ArrayList<Integer> ques, ArrayList<Integer> ans)
	{  
		if(ques.size()==0)
		    { System.out.println(ans);
		         return;
		         }
		for(int i=ques.size()-1;i>=0;i--)
		  { int c= ques.get(i);
		    ques.remove(i);
            ans.add(c);
		    permute(ques,ans);
		    ans.remove(ans.size()-1);
		    ques.add(i, c);
		}
		   

	}}