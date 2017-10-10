package Lecture3;

import java.util.Scanner;

public class octtodec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
System.out.println(" enter octal form");
int N = scn.nextInt();
int ans=0;
int p=1;
while(N!=0)
{ 
	int c= N%10;
	ans=ans+c*p;
	p=p*8;
	N=N/10;
}
System.out.println(" the decimal form is"+ans);
	}

}
