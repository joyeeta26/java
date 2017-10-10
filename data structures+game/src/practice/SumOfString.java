package practice;
import java.util.Scanner;
public class SumOfString {
	public static Scanner scn = new Scanner(System.in);
public static void main(String[] args) {
		
	
	System.out.println("enter strng");
	String str = scn.nextLine();
  
	int c=	addstring(str,0);
  System.out.println(c);
	}
   public static int  addstring(String str,int si)
   {    
	   if(str.length()==si+1)
	   { return str.charAt(si)-48;}
	   StringBuilder sb= new StringBuilder(str);
      int c=  (int)(sb.charAt(si))-48;
   
       
      int sum= addstring( sb.toString(),si+1);
       sum=sum+c;  
      return sum;
      
       
}

}