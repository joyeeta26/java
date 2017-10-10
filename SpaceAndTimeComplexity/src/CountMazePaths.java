import java.util.Scanner;

public class CountMazePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
	int p=	countmazepath(0, 0, 2, 2, "",new int[11][11]);
	System.out.println(p);
     
	}

	public static int  countmazepath(int cc, int cr, int ec, int er,String path,int rv[][]) {
		int y=0;
		if (cc == ec && cr == er) {
		
			return 1;
		}
		if(cc>ec||cr>er){
			return 0;
		}
		if(rv[cc][cr]!=0)
		{ return  rv[cc][cr];}
		y=countmazepath(cc + 1, cr, ec, er, path+"H",rv)+y;
		y=countmazepath(cc, cr + 1, ec, er, path + "V",rv)+y;
		rv[cc][cr]=y;
        return y;
	}
}
