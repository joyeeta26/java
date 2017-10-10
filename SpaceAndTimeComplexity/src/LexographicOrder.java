import java.util.Scanner;

public class LexographicOrder {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=scn.nextInt();
		printlexo(0,n);
	}

	public static void printlexo(int num,int limit)
	{  if(num>limit)
	    { return ;}
	{   
		 System.out.println(num);
		 if(num==0)
		 { for(int i=1;i<=9;i++)
		 {  
			 printlexo(10*num+i,limit);}
	    }
		 else{
		 for(int i=0;i<=9;i++)
		 {  
			 printlexo(10*num+i,limit);}
	}
	}   
		
		
	}
	
}
