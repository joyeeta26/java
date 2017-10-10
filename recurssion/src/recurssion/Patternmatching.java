package recurssion;

import java.util.Scanner;



public class Patternmatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
//    String s1=scn.nextLine();
//    String s2=scn.nextLine();
    System.out.println( pattern("abcde","de"));
  
	}
  public static int pattern(String s1,String s2)
  { 
	  int i=s2.length();
	  for(int p=0;p+i<=s1.length();p++)
	  {
	      if(s2.equals(s1.substring(p, p+i)))
		 {return p;}
	  } 
	  return -1;
  }
}
