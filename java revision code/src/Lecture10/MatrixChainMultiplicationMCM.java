package Lecture10;

public class MatrixChainMultiplicationMCM {
	// order of few matrices is given in the form of 1-d array and while
	// multiplying them tell the maximum
	// no of multiplications done.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3,1,7,9 }; // it means matrices are of order
											// 1*2,2*3,3*4,4*5,5*6
        System.out.println(MCM(arr, 0, 2));

	}

	public static int MCM(int[] arr, int si, int li) {
		if (li == arr.length) {
			return 0;
		}
		int rv = 0;
		rv = arr[si] * arr[li - 1] * arr[li] + rv + MCM(arr, si, li + 1);
		return rv;
	}
}
