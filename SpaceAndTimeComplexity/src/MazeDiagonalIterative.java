import java.util.Scanner;

public class MazeDiagonalIterative {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter end row");
		int er = scn.nextInt();
		System.out.println("enter end column");
		int ec = scn.nextInt();
		int r=count(er,ec);
		System.out.println(r);
}
public static int count (int er,int ec)  
{ int rv[][]=new int [er+1][ec+1];
for(int i=er;i>=0;i--)
{ for(int j=ec;j>=0;j--)
 {    if(i==er||j==ec)
      { rv[i][j]=1;}
else 
   {rv[i][j]=rv[i+1][j]+rv[i][j+1]+rv[i+1][j+1];}
   }
}
return rv[0][0];
}
}
