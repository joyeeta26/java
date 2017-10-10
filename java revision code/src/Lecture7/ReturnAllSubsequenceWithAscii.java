package Lecture7;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnAllSubsequenceWithAscii {

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
			   baseresult.add((int)s.charAt(0)+"");
			   return baseresult;
		   }
		   ArrayList<String> myresult= new ArrayList<>();
		   
		   char ch=s.charAt(0);
		   char c=s.charAt(1);
		   String ros=s.substring(1);
		   ArrayList<String>recresult=subsequence(ros);
		 
		 for(int i=0;i<recresult.size();i++)
		  {    String r=(int)(c)+"";
		  if((recresult.get(i).charAt(0)==c)||recresult.get(i).length()>=2&&recresult.get(i).substring(0,2).equals(r)||recresult.get(i).length()>=3&&recresult.get(i).substring(0,3).equals(r))
		  {
		    	myresult.add(ch+recresult.get(i));
		    	myresult.add(recresult.get(i));
		    	myresult.add((int)ch+recresult.get(i));
		     }
		    else
		    {
		    	myresult.add(recresult.get(i));
		    	
		    }
		 }
	    	myresult.add(ch+"");
	    	myresult.add((int)ch+"");
		    return myresult;
	   }
	 }
