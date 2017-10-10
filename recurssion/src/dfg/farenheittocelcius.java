package dfg;

import java.util.Scanner;

public class farenheittocelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn =new Scanner(System.in);
   boolean b=true;
   while(b)
   {
   
   char ch=scn.next().charAt(0);
 
   if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
   {
	   int N1 =scn.nextInt();
	   int N2 =scn.nextInt();
	   calculator(ch,N1,N2);
   }
   else if(ch!='X'&&ch=='x')
	   {System.out.println("try again");}
   else
	break;
   }
  }
	
	public static void calculator(char ch,int N1,int N2)
	{  int t;
	  if(ch==43)
		  t=N1+N2;
	  else if(ch==45)
		  t=N1-N2;
	  else if(ch==47)
		  t=N1/N2;
	  else if(ch==42)
		  t=N1*N2;
	  else 
		  t=N1%N2;
	  System.out.println(t);}
	
}
