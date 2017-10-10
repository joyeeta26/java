package ass;
import java.util.Scanner;

public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		int i,j;

		for(i=1;i<=N;i++)
		{  System.out.print("1\t");
			int r=0;int b=1;
			for (j=1;j<=i-1;j++)
		   { 
				b=(b*(i-j))/(j);
		     System.out.print(b+"\t");
		  r++; }
			System.out.println();
	     }
	}		
	}


