import java.util.Scanner;

public class StringEditIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		// TODO Auto-generated method stub
		String s1 = scn.nextLine();
		String s2 = scn.nextLine();
		int e = dr(s1, s2);
		System.out.println(e);
	}

	public static int dr(String s1, String s2) {
		 int rv[][]=new int [s1.length()+1][s2.length()+1];
		 for(int i=s2.length();i>=0;i--)
		 { rv[s1.length()][i]=s2.length()-i;}
		 for(int i=s1.length();i>=0;i--)
		 { rv[i][s2.length()]=s1.length()-i;}
		 
		 
		for(int row=s1.length()-1;row>=0;row--)
		{ for(int col=s2.length()-1;col>=0;col--)
		{   
			
			if(s1.charAt(row)==s2.charAt(col))
		
		  { rv[row][col]=rv[row+1][col+1];}
		else{  rv[row][col]=1+Math.min(rv[row+1][col+1],Math.min(rv[row][col+1],rv[row+1][col+1]));}
			
			
	}

}

	return rv[0][0];}}