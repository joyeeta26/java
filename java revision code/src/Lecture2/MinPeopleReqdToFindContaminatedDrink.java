package Lecture2;

import java.util.Scanner;
// Using the concept of binary conversion of numbers

public class MinPeopleReqdToFindContaminatedDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 // no. of drinks out of which one is contaminated
		 int N = scn.nextInt();
		 int i=2;
		 int rv=1;
		 while(N/i>0)
		 {  rv++;
			 i=2*i;
		 }
		 System.out.println(rv);
	}

}
