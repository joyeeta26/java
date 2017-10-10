package Lecture7;

import java.util.ArrayList;
import java.util.Scanner;

  public class ReturnAllSubsequenceOfString {
  public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
     String s=scn.nextLine();
     
    ArrayList<String> subsequence= subsequence(s);
    System.out.println(subsequence);
	}
   public static ArrayList<String> subsequence(String s)
   {
	   if(s.length()==1)
	   {
		   ArrayList<String> baseresult= new ArrayList<>();
		   baseresult.add(s);
		   return baseresult;
	   }
	   ArrayList<String> myresult= new ArrayList<>();
	   
	  char ch=s.charAt(0);
	   char c=s.charAt(1);
	   String ros=s.substring(1);
	   ArrayList<String>recresult=subsequence(ros);
	 
	 for(int i=0;i<recresult.size();i++)
	  {     
	    
	    	myresult.add(ch+recresult.get(i));
	    	myresult.add(recresult.get(i));
	     
	   
	 }
    	myresult.add(ch+"");
	    return myresult;
   }
 }
