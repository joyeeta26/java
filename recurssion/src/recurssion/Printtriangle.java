package recurssion;

import java.util.Scanner;

public class Printtriangle {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int N = scn.nextInt();
		triangle(0,0,N);
		//System.out.println(c);
	}

	public static void triangle (int row,int col,int n ) {
	
		if(row>n)
		{ return ;}
		if(col>n)
		{  System.out.println();
			triangle(row+1,1,n);
			return ;
		}
		System.out.print("*");
		triangle(row,col+1,n);
	}
}
