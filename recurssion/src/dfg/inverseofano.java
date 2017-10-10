package dfg;

import java.util.Scanner;

public class inverseofano {

	public static void main(String[] args) {
		boolean b=false;
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int t=1;int sum=0;
		int y=n;
		while(n!=0)
		{  int r=n%10;
		   sum=sum+t*(int)Math.pow(10, r-1);
		   n=n/10;
		   t++;
		}
		System.out.println(sum);
		if(y==sum)
			b=true;
		System.out.println(b);

	}

}
