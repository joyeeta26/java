package recurssion;

import java.util.Scanner;

public class Chessboard {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		

		getBoardPaths(0, 0, 2, 2, "");
		// System.out.println(sum[0]);
		// sort(sum);
		// display(sum);

	}

	public static void getBoardPaths(int cc, int cr, int ec, int er, String path) {
		if (cc == ec && cr == er) {
			System.out.println(path);
			return;
		}
		if(cc>ec||cr>er)
		{return ;}
		
			
		getBoardPaths(cc + 1, cr+2, ec, er, path + "K1");
			getBoardPaths(cc+2, cr+1 , ec, er, path + "K2");
			


			if(cr==0||cr==er||cc==0||cc==ec)
			{ for(int i=1;i<=er;i++)
			{
			getBoardPaths(cc+i , cr, ec, er, path + "R"+i);
			getBoardPaths(cc , cr+i, ec, er, path + "R"+i);
			}
			}
			if(cc==cr||cc+cr==ec)
			{ for(int i=1;i<=ec;i++)
			   { getBoardPaths(cc+i , cr+i, ec, er, path + "B"+i);}
			}


	}

}
