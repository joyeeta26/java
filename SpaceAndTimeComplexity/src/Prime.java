import java.util.Arrays;
import java.util.Scanner;

public class Prime {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no");
		int n = scn.nextInt();
		
      prime(n);
	}
public static void prime(int n)
{   boolean primes[]=new boolean[n+1];
    Arrays.fill(primes, true);
    for(int i=2;i*i<=n;i++)
    	{if(primes[i]==true){
      for(int mul=i;mul*i<=n;mul++)
    {   primes[i*mul]=false;
    }}}
    for(int y=2;y<=n;y++)
    { if(primes[y]==true)
    { System.out.println(y);
    }
}
}
//public static void prime(int n)
//{   boolean primes[]=new boolean[n+1];
//    for(int i=2;i*i<=n;i++)
//    	{if(primes[i]==false){
//      for(int mul=i;mul*i<=n;mul++)
//    {   primes[i*mul]=true;
//    }}}
//    for(int y=2;y<=n;y++)
//    { if(primes[y]==false)
//    { System.out.println(y);
//    }
//}
}