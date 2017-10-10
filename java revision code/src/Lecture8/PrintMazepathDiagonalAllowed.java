package Lecture8;

import java.util.Scanner;

public class PrintMazepathDiagonalAllowed {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("enter rows and columns in a maze");
  int row =scn.nextInt();
  int col=scn.nextInt();
   printmazepath(0,row,0,col,"");
   
	}
 public static void printmazepath(int cr,int er,int cc,int ec,String ans)
 {  if(cr==er&&cc==ec)
 {
	 System.out.println(ans);
	 return;
 }
	 if(cr!=er)
	 {
		 printmazepath( cr+1, er,cc, ec,"V"+ans);
	 }
	 if(cc!=ec)
	 {
		 printmazepath( cr, er,cc+1, ec,"H"+ans);
	 }
	 if(cr!=er&&cc!=ec)
	 {
		 printmazepath( cr+1, er,cc+1, ec,"D"+ans);
	 }
 }
}
