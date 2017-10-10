package Lecture7;

import java.util.ArrayList;
import java.util.Scanner;
// on a mobile phone if we have to dial a 10 digit no. ,how many different nos. can be dialled
//for making this question short let us assume that the mobile no. is of 5 digits,or user can tell length of mobile no
// no. cannot statrt with 0 but can contain 0 in between
public class KeypadCombinations {
	 public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter length of mobile no");
		int n=scn.nextInt();
      ArrayList<String> list = keypadcombo(n,n);
      System.out.println(list);
      }
public static ArrayList<String> keypadcombo(int n,int fix)
{  
	if(n==1)
	{
		ArrayList<String> baseresult= new ArrayList<>();
		for(int i=0;i<=9;i++)
	  { baseresult.add(i+"");}                // if i write baseresult.add(i); , it will be an error bcz only strings can be added
	return baseresult;                       // and not integers,so this is the way to solve this problem
	}
	
	ArrayList<String> myresult= new ArrayList<>();
	ArrayList<String> recresult = keypadcombo(n-1,fix);
	for(int i=0;i<recresult.size();i++)
	{  for(int j=0;j<=9;j++)
	{   if(n==fix&&j==0)
	   { continue;}
		myresult.add(j+recresult.get(i));
	}
	}
	return myresult;
}
}
