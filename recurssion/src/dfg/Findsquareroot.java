package dfg;

import java.util.Scanner;

public class Findsquareroot {
	public static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=scn.nextInt();
		int P=scn.nextInt();
		double c=findroot(N,P);
		System.out.println(c);
		int r=(int)(c*(int)Math.pow(10,P));
		
		double p=r/Math.pow(10,P);
		System.out.println(p);
		
	}
public static double findroot(double N,int P)
{ double c=1;double i=0;
   double r=Math.pow(10,-P);
   System.out.println(r);
	while(true)

    { if(i*i>N)
        { return i-r;}
    i=i+r;
    }
}
}
