package recurssion;

import java.util.Scanner;

public class PascalsTriangle {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = scn.nextInt();
		
		pascaltriangle(N-1,0);
		
	}

	public static void pascaltriangle (int row,int si) {
	   int c=1;
		if(si==row+1)
		{ return ;}
		
		for(int i=0;i<=si;i++ )
		{  System.out.print(c+" ");
		   c=(c*(si-i))/(i+1);
		}System.out.println();
		pascaltriangle(row,si+1);
	}
}