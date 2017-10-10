import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intersectionofarray {

	public static Scanner scn = new Scanner(System.in);
	public static int p = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scn.nextInt();
		int[] arr = take(N);
		int M = scn.nextInt();

		int[] other = take(M);

		ArrayList<Integer> list;
		list = intersection(arr, other);
		// System.out.println(sum[0]);
		// sort(sum);
		// display(sum);
		System.out.println(list);
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break;
				}
			}
		}
	}

	public static void display(int[] arr) {

		System.out.print("[" + arr[arr.length - p]);
		for (int i = arr.length - p + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.print(", " + arr[i]);
			}
		}
		System.out.println("]");
	}

	public static int[] take(int N) {
		int[] rv = null;
		rv = new int[N];
		for (int i = 0; i < N; i++) {
			rv[i] = scn.nextInt();
		}
		return rv;
	}

	public static ArrayList<Integer> intersection(int[] arr, int[] other) {
		ArrayList<Integer> list;
		Arrays.sort(arr);
		Arrays.sort(other);
		list = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < arr.length && j < other.length) {
			if (arr[i] == other[j]) {

				list.add(arr[i]);
				i++;
				j++;
			} else if (arr[i] < other[j]) {
				i++;

			} else {
				j++;
			}
		}
		return list;
	}

}