import java.util.Scanner;

public class SlidingBoardpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter end");
		int end = scn.nextInt();
		int t=count(end);
		System.out.println(t);
	}
   public static int count(int end)
   {  int rv[]=new int [6];
       rv[0]=1;
         for(int i=1;i<=end;i++)
         {  int temp=rv[0]+rv[1]+rv[2]+rv[3]+rv[4]+rv[5];
            rv[5]=rv[4];
            rv[4]=rv[3];
            rv[3]=rv[2];
            rv[2]=rv[1];
            rv[1]=rv[0];
            rv[0]=temp;
         }
         return rv[0];
   }
}
