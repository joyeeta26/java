package recurssion;

import java.util.Scanner;

public class mineandport {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		

		mineports(0, 0, 4, 4, "");
		

	}

	public static void mineports(int cc, int cr, int ec, int er, String path) {
		if (cc == ec && cr == er) {
			System.out.println(path);
			return;
		}
		 if(cc>ec||cr>er)
		{return ;}
	
		
			if(((cr+1)*4+ cc+1)%6==0)
			{	mineports(ec, er, ec, er, path + "P");
			return;}
			
			if(((cr+1)*4+ cc+1)%3==0&&((cr+1)*4+ cc+1)%6!=0)
				{ return ;}
			
		mineports(cc + 1, cr+2, ec, er, path + "K1");
		mineports(cc+2, cr+1 , ec, er, path + "K2");
			


			if(cr==0||cr==er||cc==0||cc==ec)
			{ for(int i=1;i<=ec-cc;i++)
			 {
				mineports(cc+i , cr, ec, er, path + "R"+i);}
			for(int i=1;i<=er-cr;i++)
				{mineports(cc , cr+i, ec, er, path + "R"+i);
			 }
			}
			if(cc==cr||cc+cr==ec)
			{ for(int i=1;i<=ec;i++)
			   { mineports(cc+i , cr+i, ec, er, path + "B"+i);}
			}


	}

	}



	