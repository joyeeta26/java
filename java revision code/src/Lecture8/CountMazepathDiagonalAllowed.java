package Lecture8;

import java.util.Scanner;

public class CountMazepathDiagonalAllowed {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rows and columns in a maze");
		int row = scn.nextInt();
		int col = scn.nextInt();
		System.out.println(numpath(0,row,0,col));
	}
  public static int numpath(int cr,int er,int cc,int ec)
  {   
	  if(cr==er&&cc==ec)
	  {
		  return 1;
	  }
	  int c=0;
	  if(cr != er)
	  {
		  c=numpath(cr+1,er,cc,ec);
	  }
	  if(cc != ec)
	  {
		  c=numpath(cr,er,cc+1,ec)+c;
	  }
	  if(cc != ec&&cr!=er)
	  {
		  c=numpath(cr+1,er,cc+1,ec)+c;
	  }
	  return c;
  }
}
