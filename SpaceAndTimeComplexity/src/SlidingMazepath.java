import java.util.Arrays;
import java.util.Scanner;

public class SlidingMazepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter end row");
		int er = scn.nextInt();
		System.out.println("enter end column");
		int ec = scn.nextInt();
		int r=count(er,ec);
		System.out.println(r);
}
		
	public static int  count (int er,int ec)
	{   int rv[]=new int[ec+1];
	 Arrays.fill(rv, 1);
	   

      for(int row=er-1;row>=0;row--)
      { for(int col=ec-1;col>=0;col--)
        {  int t=rv[col]+rv[col+1];
             rv[col]=t;
         
        }
      }
      return rv[0];
	}

}
