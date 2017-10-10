package recurssion;

import java.util.Scanner;

public class Printtriangles {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	int row = scn.nextInt();
		//int col = scn.nextInt();
		int n = scn.nextInt();
		triangle(0,0,n);
		//System.out.println(c);
	}

	public static void triangle (int row,int col,int n ) {
	
		if(row>n)
		{ return ;}
		if(col>row)
		{  System.out.println();
			triangle(row+1,0,n);
			return ;
		}
		System.out.print("*");
		triangle(row,col+1,n);
	}
}