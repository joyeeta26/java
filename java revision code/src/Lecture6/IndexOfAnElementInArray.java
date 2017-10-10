package Lecture6;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfAnElementInArray {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = takeinput();
		System.out.println("enter element to be searched");
		int element = scn.nextInt();
		int i1 = firstindex(arr, element, 0, arr.length - 1);
		System.out.println(i1);
		int i2 = lastindex(arr, element, 0, arr.length - 1);
		System.out.println(i2);
		ArrayList<Integer> list = allindex(arr, element, 0, arr.length - 1);
		System.out.println(list);
	}

	public static int[] takeinput() {
		System.out.println("enter size of array");
		int N = scn.nextInt();
		int rv[] = new int[N];
		for (int i = 0; i < N; i++) {
			rv[i] = scn.nextInt();
		}

		return rv;
	}

	public static int lastindex(int[] arr, int element, int si, int li) {
		if (si > li) {
			return -1;
		}
		int c = lastindex(arr, element, si + 1, li);
		if (c == -1) {
			if (arr[si] == element) {
				return si;
			} else {
				return -1;
			}

		} else {
			return c;
		}

	}

	public static int firstindex(int[] arr, int element, int si, int li) {
		if (si > li) {
			return -1;
		}
		int c = firstindex(arr, element, si + 1, li);
		if (c == -1) {
			if (arr[si] == element) {
				return si;
			} else {
				return -1;
			}

		} else {
			if (arr[si] == element) {
				return si;
			} else {
				return c;
			}
		}

	}

	public static ArrayList<Integer>  allindex(int[] arr, int element, int si, int li) {
		if (si > li) {
			ArrayList<Integer> rv =new ArrayList<>();
			return rv;
		}
		ArrayList<Integer> mylist =new ArrayList<>();
		mylist=allindex(arr, element, si + 1, li);
		if(arr[si]==element)
		{
			mylist.add(si);
		}
		return mylist;

	}

}
