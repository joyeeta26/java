package dfg;

import java.util.Scanner;

public class linearsearch {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []arr=take();
int  max=returnmax(arr);
 System.out.println(max);
	}

public static int[] take()
{ 
	int []rv=null;
  System.out.println("enter size of array");
  int n =scn.nextInt();
  rv=new int [n];
  for(int i=0;i<n;i++)
  { System.out.println("enter" +(i)+ "th element");
	   rv[i] = scn.nextInt();
  } return rv;
}
public static int returnmax(int []other)
{  System.out.println("enter no to be searched");
int b =scn.nextInt();
    for(int i=0;i<other.length;i++)
    { if(b==other[i])
    	return i;
    }
    return -1;
   }
}



