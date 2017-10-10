package dfg;

import java.util.Scanner;

public class maximumrepetition {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = scn.nextLine();
	maxfrequency(str);
	//	System.out.println(ans);
	}
	
 public static void maxfrequency(String str)
 { char ch='\0';int p=0;
	 for(int i=0;i<str.length();i++)
 { int c=1;
  for(int j=i+1;j<str.length();j++)
 {  if(str.charAt(i)==str.charAt(j))
    { c++;
    }
    }
  if(c>p)  {  ch=str.charAt(i);}
  p=c;
 }   
 System.out.print(ch);
 }
 }
