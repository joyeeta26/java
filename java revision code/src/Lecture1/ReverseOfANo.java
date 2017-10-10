package Lecture1;

import java.util.Scanner;

public class ReverseOfANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 int N = scn.nextInt();
		 while(N>0)
		 { System.out.print(N%10);
		   N=N/10;
		 }
	}

}
