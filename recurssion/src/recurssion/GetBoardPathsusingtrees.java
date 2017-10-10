package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetBoardPathsusingtrees {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scn.nextInt();
		
		
	getBoardPaths(0,N,"");
		// System.out.println(sum[0]);
		// sort(sum);
		// display(sum);

	}

	public static void getBoardPaths(int curr, int end,String path){
		if(curr == end){
			System.out.println(path); 
		}
		for(int dice=1;dice<=6&&dice+curr<=end;dice++)
		{ getBoardPaths(curr +dice, end,path+dice);}
		
		}
		
		
	}

