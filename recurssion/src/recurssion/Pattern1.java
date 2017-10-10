package recurssion;
                           //TO PRINT BOX
import java.util.Scanner;

public class Pattern1 {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = scn.nextInt();
		int col = scn.nextInt();
		int n = scn.nextInt();
		pattern(row,col,n);
		//System.out.println(c);
	}

	public static void pattern (int row,int col,int n ) {
	
		if(row>n)
		{ return ;}
		if(col>n)
		{  System.out.println();
			pattern(row+1,1,n);
			return ;
		}
		System.out.print("*");
		pattern(row,col+1,n);
	}
}

