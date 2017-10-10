package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfString {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();
		int c = noofPermutation(str.length());
		System.out.println(c);
		permute(str, "");
		System.out.println(Permute(str));

	}

	public static int noofPermutation(int t) {
		int p = 1;
		while (t >= 1) {
			p = p * t;
			t--;
		}
		return p;
	}

	public static void permute(String ques, String ans) {
		if (ques.length() == 0) {

			System.out.println(ans);

			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char c = ques.charAt(i);

			String ros = ques.substring(0, i) + ques.substring(i + 1);

			permute(ros, ans + c);

		}

	}

	public static ArrayList<String> Permute(String str) {
		if (str.length() == 1) {
			ArrayList<String> baseResult = new ArrayList<>();

			baseResult.add(str);

			return baseResult;

		}
		
	
			char ch = str.charAt(0);
			String ros = str.substring(1);
			ArrayList<String> recResult = Permute(ros);
			ArrayList<String> myResult = new ArrayList<>();
			for(int p=0;p<recResult.size();p++)
			{    String s1=recResult.get(p).substring(0);
			
				myResult.add(ch+s1);
		     	for (int i =recResult.get(p).length()-1; i >=1; i--) {
		     		
				
		     		String fh=recResult.get(p).substring(0,i);
				
				
				
				String sh=recResult.get(p).substring(i,recResult.get(p).length());
		     		
		     	
				myResult.add(fh+ch+sh);
		     	
		            
		     		
			}  
		     	myResult.add(s1+ch);
		     	
		}
	
		return myResult;

	}
	
}
