
public class MatrixMultiplication2method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int arr[] = { 10, 20, 30, 40, 50, 60 };

				int t = dims(arr, 0, arr.length - 1, new int[arr.length][arr.length]);
				System.out.println(t);

			}

			public static int dims(int[] arr, int si, int li, int[][] strg) {
				int rt =0;
				int rv=0;
				if (li - si == 1) {
					return 0;
				}
				if (strg[si][li] != 0) {
					return strg[si][li];
				}
				for(int i=si+1;i<li;i++)
				{	int t1=dims(arr,si,i,strg);
				int t2 = dims(arr,i,li,strg);
				int t3=arr[si]*arr[i]*arr[li];
				rv=t1+t2+t3;
				if(rv>rt)
					rt=rv;
				}
			
				strg[si][li] = rv;
				return rv;
			}
		}