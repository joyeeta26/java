package recurssion;

import java.util.ArrayList;
import java.util.Scanner;

public class kpc {


	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.nextLine();
		int g=count(str," ",0);
		System.out.println(g);
      		keypad(str,"");
      		ArrayList<String> list;
    		list = kpc(str,0);
    		System.out.println(list);

		
	}
	public static  ArrayList<String> kpc(String str,int si)
	{ if(str.length()==0)
	   { ArrayList<String> baseResult = new ArrayList<>();

		baseResult.add("");

		return baseResult;

	}
	ArrayList<String> myResult = new ArrayList<>();
	String ros=str.substring(1);
	
	int ch =(int)(str.charAt(0)-48);
	ArrayList<String> recResult = kpc(ros,si+1);
	if(ch<=8)
	{for (int i = 0; i < recResult.size(); i++) {
		 int y=3*(ch)-2;
		    char d=(char)(y+96);
		myResult.add((char)(d)+recResult.get(i));
		myResult.add((char)(d+1)+recResult.get(i));
		myResult.add((char)(d+2)+recResult.get(i));
	}}
	else
		{for (int i = 0; i < recResult.size(); i++) {
			 int y=3*(ch)-2;
			    char d=(char)(y+96);
			myResult.add(recResult.get(i) +(char)(d));
			myResult.add(recResult.get(i) +(char)(d+1));
	
		}}
	
	return myResult;
	}

	public static int count(String str,String sol,int g) {
		if (str.length() == 0) {
		
		g++;
			return g;
		}

		int ch =(int)(str.charAt(0)-48);
	
		String ros = str.substring(1);
		if(ch<=8)
		{   int y=3*(ch)-2;
		    char d=(char)(y+96);

		    
		g=	count(ros,sol+(char)(d),g);
	      g=  count(ros,sol+(char)(d+1),g);
	    g=	count(ros,sol+(char)(d+2),g);
	    	return g;
		}
		else {
			 int y=3*(ch)-2;
			    char d=(char)(y+96);
			g=	count(ros,sol+'d',g);
		      g=  count(ros,sol+(char)(d+1),g);
		    	return g;}
	}
	public static void keypad(String str,String sol) {
		if (str.length() == 0) {
			System.out.println(sol);
		
			return ;
		}

		int ch =(int)(str.charAt(0)-48);
	
		String ros = str.substring(1);
		if(ch<=8)
		{   int y=3*(ch)-2;
		    char d=(char)(y+96);

		    
			keypad(ros,sol+(char)(d));
	        keypad(ros,sol+(char)(d+1));
	    	keypad(ros,sol+(char)(d+2));
	    	return;
		}
		if(ch==9){
			 int y=3*(ch)-2;
			    char d=(char)(y+96);
				keypad(ros,sol+'d');
		        keypad(ros,sol+(char)(d+1));
		    	return;}
	}
	
	       
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
