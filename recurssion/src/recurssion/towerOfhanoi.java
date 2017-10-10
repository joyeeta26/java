package recurssion;

import java.util.Scanner;

public class towerOfhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     int n= scn.nextInt();
     String source="T1",destination="T2",helper="T3";
    int w= toh(n,source,destination,helper);
     System.out.println(w+1);
	}
public static int toh(int n,String T1,String T2,String T3)
{  int r=0;
	if(n==1)
	{  System.out.println("Move disc "+n +" from "+T1 +" to "+T2);
	  return 0; 
	}
	r= toh(n-1,T1,T3,T2)+r+1;
	System.out.println("Move disc "+n +" from "+T1 +" to "+T2);
	r=toh(n-1,T3,T2,T1)+r+1;
	
	return r;
	
	
}
}
