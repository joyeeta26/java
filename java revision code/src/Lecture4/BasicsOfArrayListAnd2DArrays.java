package Lecture4;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicsOfArrayListAnd2DArrays {
	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<>();
		int arr[][] = new int[5][4];
		l.add(1);
		l.add(3);
		l.add(1, 2);

		arr[0][0] = 1;
		arr[0][2] = 2;
		System.out.println(l);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(l.get(1));
		System.out.println(l);
		l.set(1, 4);
		System.out.println(l);
		System.out.println(l.remove(1));

		System.out.println(l);
		
	}

}
