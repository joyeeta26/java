package recurssion;

import java.util.Scanner;

public class Reversetrianglediffmethod {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = scn.nextInt();
		triangle(0,0,n);
		//System.out.println(c);
	}

	public static void triangle (int row,int col,int n ) {
	
		if(row>n)
		{ return ;}
		if(col>row)
		{			triangle(row+1,1,n);
			 System.out.println();
			return ;
		}
		
		triangle(row,col+1,n);
		System.out.print("*");
	}
}