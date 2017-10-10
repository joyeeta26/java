package Lecture3;

import java.util.Scanner;

public class dectobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				Scanner scn = new Scanner(System.in);
				System.out.println("enter decimal form");
				int N = scn.nextInt();
				int p = 1;
				int dec = 0;
				while (N != 0) {
					int c = N % 2;
					dec = dec + c * p;
					p = p * 10;
					N = N / 2;
				}
				System.out.println("the binary form is "+dec);
			}

		}
