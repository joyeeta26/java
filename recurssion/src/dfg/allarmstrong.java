package dfg;

import java.util.Scanner;

public class allarmstrong {
	public static void main(String[] args) {
	for(int j=100;j<=999;j++)
	{ int i=j;
	int r=i;int sum=0;
	while(i!=0)
	{ int rem=i%10;
	  sum=sum+rem*rem*rem;
	  i=i/10;
	}
	if(r==sum)
	{ System.out.println(j);}
	

}

}
}

	
