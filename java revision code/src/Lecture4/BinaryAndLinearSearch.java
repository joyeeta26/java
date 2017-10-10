package Lecture4;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryAndLinearSearch {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeinput();
		Arrays.sort(arr);             // because binary search works on sorted array
		System.out.println("enter element to be searched");
		int element = scn.nextInt();
		int indexLS = linearS(arr, element);
		int indexBS = binaryS(arr, element);
		System.out.println(indexLS);
		System.out.println(indexBS);
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

	public static int linearS(int[] arr, int element) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}

		return -1;
	}

	public static int binaryS(int[] arr, int element) {
		int li=0;
		int hi=arr.length-1;
		while(li<=hi)
		{
			 int mid=(li+hi)/2;
			 if(arr[mid]==element)
			 { return mid;}
			 else if(arr[mid]>element)
			 { hi=mid-1;}
			 else{ li=mid+1;}
		}
				 
			 return -1;
		}
}
