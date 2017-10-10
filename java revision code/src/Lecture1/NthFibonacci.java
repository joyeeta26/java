package Lecture1;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scn = new Scanner(System.in);
 int N = scn.nextInt();
 int zeroth=0;  
  int first =1;
  int next=2;
  int rv=0;
 while(next<=N)
 {  rv=first + zeroth;
 zeroth = first;
   first = rv;
   next++;
 } System.out.println(rv);
	}

}
