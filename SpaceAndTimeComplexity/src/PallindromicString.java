import java.util.Scanner;

public class PallindromicString {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();
//		int f=polynomial(2,3);
//		System.out.println(f);
//		int  b = checkodd(str);
//		int c=checkeven(str);
//		System.out.println(b+c);
	}
	
	public static int checkodd(String str)
	{ int o=0;
	for(int axis=0;axis<str.length();axis++)
	{	int orbit=0;
	 while(orbit+axis<str.length()&&axis-orbit>=0)
	{ if(str.charAt(axis+orbit)==str.charAt(axis-orbit))
	   {  o++;
	   
	  
	orbit++;}
	else break;
	
	}  }return o;
	   
	}
//	public static int checkeven(String str)
//	{ int o=0;
//	for(double axis=0.5;axis<str.length();axis++)
//	{	double orbit=0.5;
//	 while(orbit+axis<str.length()&&axis-orbit>=0)
//	{ if(str.charAt((int)(axis+orbit))==str.charAt((int)(axis-orbit)))
//	   {  o++;
//	   
//	  
//	orbit++;}
//	else break;
//	
//	}  }return o;
//	   
//	}
//public static int checkeven(String str)
//{ int o=0;
//for( int axis=0;axis<str.length();axis++)
//{	 int orbit=0;
// while(orbit+axis+o+1<str.length()&&axis>=0)
//{ if(str.charAt((axis-o))==str.charAt((axis+orbit+o+1)))
//   {  o++;
//   
//  
//orbit++;}
//else break;
//
//}  }return o;
//   
//}}
//	public static int polynomial(int x,int n)
//	{ int c=n; int sum=0;
//	  for(int i=1;i<=n;i++)
//	  {int p= x*c;
//	     sum=sum+p;
//	    c--;
//	    x=x*x;
//	  }
//	  return sum;
//	  }
	}