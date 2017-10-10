import java.util.Scanner;

public class BoardPathsIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter end");
		int end = scn.nextInt();
		int t=count(end);
		System.out.println(t);
	}
  public static int count (int end)
  {  int rv[]=new int [end+6];
     rv[end]=1;
       for(int i=end-1;i>=0;i--)
       { for(int j=1;j<=6;j++)
           { rv[i]=rv[i+j]+rv[i];} 
       }
       return rv[0];
  }            
}
