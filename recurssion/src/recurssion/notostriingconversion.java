package recurssion;

import java.util.Scanner;

public class notostriingconversion {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		
     String se=scn.nextLine();
		stringconv(se,"",0);

	}

	public static void stringconv(String  ques, String ans,int si ) {
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		char c=(char)(ch+48);
		String ros=ques.substring(1);
		stringconv(ros,ans+c,si+1);
		
		if(ques.length()>=2)
		{	String str=ques.substring(0, 2);
		String ty=ques.substring(2);
		int p=addstring(str,0);
		if(p>0&&p<=26)
		{
        char t=(char)(p+96);
        stringconv(ty,ans+t,si+1); 
        }
		return;
		}

		}
	 public static int  addstring(String str,int si)
	   {    
		   if(str.length()==si+1)
		   { return str.charAt(si)-48;}
		   StringBuilder sb= new StringBuilder(str);
	      int c=  (int)(sb.charAt(si))-48;
	      
	       
	      int sum= addstring( sb.toString(),si+1);
	       sum=sum+c*(int)Math.pow(10, str.length()-si-1);  
	      return sum;
	      
	       
	}
}