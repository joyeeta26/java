package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class abc {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter target");
		int N = scn.nextInt();

		ArrayList<String> list;
		list = getBoardPaths(0,N);
		
		System.out.print(list);
	}

	public static ArrayList<String> getBoardPaths(int curr, int end){
		if(curr == end){
			ArrayList<String> baseResult = new ArrayList<>();
			
			baseResult.add("");
			
			return baseResult;
		}
		
		ArrayList<String> myResult = new ArrayList<>();
		
		for(int dice = 1; dice <= 6 && curr + dice <= end; dice++){
			ArrayList<String> recResult = getBoardPaths(curr + dice, end);
			for(int i = 0; i < recResult.size(); i++){
				myResult.add(dice + recResult.get(i));
			}
		}
			
			
		
		
		return myResult;
	}
}
