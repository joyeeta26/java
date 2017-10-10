package Lecture2;

import java.util.Scanner;

public class TotalNoOfFibonacciNosLessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scn = new Scanner(System.in);
		    int N = scn.nextInt();
		    // 55 is the fibonacci of 10,i.e.55 is the 10th fibonacci as 0 is the 0th fibonacci,but total no of fibonacci less than 55 will be 10(write and see) 
		    int one=0;
		    int two=1;
		    int three=1;
		    int count =1;
		    while(three<N)
		    { count++;
		       three=one+two;
		       one=two;
		       two=three;
		    }
		    System.out.println(count);
	}

}
