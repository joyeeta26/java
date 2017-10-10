package practice;

import java.util.Scanner;

public class BalancingAct {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();
			
		Boolean b = check(str, "");
		System.out.println(b);
	}

	public static Boolean check(String str, String sol) {
	
		
		
		
		if(str.length()==0)
		{ if(sol.length()==0)
		    { return true;}
		else { return false;}
		}
		Boolean b= false;
		char c=str.charAt(0);
		String ros=str.substring(1);
		
		
		if("[{(".indexOf(c)!=-1)
		{  b = check(ros,sol+c);}
		else if("]})".indexOf(c)!=-1)
		{   if(sol.length()==0)
		   { return false;} 
		else if(str.charAt(0)==')'&&sol.charAt(sol.length()-1)!='(')
		           { return false;}
		else if(str.charAt(0)=='}'&&sol.charAt(sol.length()-1)!='{')
		           { return false;}
		else if(str.charAt(0)==']'&&sol.charAt(sol.length()-1)!='[')
		       { return false;}
		else 
		    {   b = check(ros,sol.substring(0, sol.length()-1));}
		}
		
		else {  b = check(ros,sol);}
		return b;
		
	}

}