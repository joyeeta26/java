package Lecture2;

import java.util.Scanner;

public class SumOfEvenAndOddPlacedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
		 int N = scn.nextInt();
		 int counter=0;
		 boolean b=true;
		 int s1=0,s2=0;
		 while(N>0)
		 { counter++;
			 if(b)
			 { s1=s1+N%10;}
			 else
			 {  s2=s2+N%10;}
			 b=!b;
		   N=N/10;
		 }
		 if(counter%2==0)
		 { System.out.println("odd sum is "+s2+" even sum is "+s1);}
		 else
		 { System.out.println("odd sum is "+s1+" even sum is "+s2);}
	}

}
