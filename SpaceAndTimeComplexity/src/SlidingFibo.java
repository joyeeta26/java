import java.util.Scanner;

public class SlidingFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no");
		int n = scn.nextInt();
		
     int r= fibo(n);
     System.out.println(r);
	}
  public static int fibo(int n)
  {   int rv[] = new int[2];
       rv[0]=0;
       rv[1]=1;
       for(int i=2;i<=n;i++)
       { int temp=rv[0]+rv[1];
          rv[0]=rv[1];
          rv[1]=temp;
       }
       return rv[1];
  }
}
