
 public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3,1,7,9 };

		int t = dims(arr, 0, arr.length - 1, new int[arr.length][arr.length]);
		System.out.println(t);

	}

	public static int dims(int[] arr, int si, int li, int[][] strg) {
		int rv = 0;
		if (li - si == 2) {
			return arr[si] * arr[si + 1] * arr[si + 2];
		}
		if (strg[si][li] != 0) {
			return strg[si][li];
		}
		int t1 = arr[si] * arr[li - 1] * arr[li] + dims(arr, si, li - 1, strg);
		int t2 = arr[si] * arr[si + 1] * arr[li] + dims(arr, si + 1, li, strg);
		rv = Math.min(t1, t2);
		strg[si][li] = rv;
		return rv;
	}
}
