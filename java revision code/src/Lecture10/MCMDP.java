package Lecture10;

public class MCMDP {

	// order of few matrices is given in the form of 1-d array and while
		// multiplying them tell the maximum
		// no of multiplications done.
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = { 100, 200, 600, 400, 500, 300 }; // it means matrices are of order
												// 1*2,2*3,3*4,4*5,5*6
	        System.out.println(MCM(arr, 0, 2,new int[arr.length+1]));

		}

		public static int MCM(int[] arr, int si, int li,int [] strg) {
			if (li == arr.length) {
				return 0;
			}
			int rv = 0;
			if(strg[li+1]!=0)
			{ 
				rv=strg[li+1];
			}
			else  { rv = arr[si] * arr[li - 1] * arr[li] + rv + MCM(arr, si, li + 1,strg);}
			strg[li]=rv;
			return rv;
		}
	}