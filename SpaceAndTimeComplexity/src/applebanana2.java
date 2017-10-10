import java.util.Scanner;

public class applebanana2 {
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int T=scn.nextInt();
        for(int w=0;w<T;w++)
        {   int a=0;
            int b=0;
        
        	String s=scn.next();
        	
        	int x=scn.nextInt();
        	int y=scn.nextInt();
        	for(int i=0;i<s.length();i++)
        	{
        		if(s.charAt(i)=='a') { a++;}
        		else{b++;}
        	}
        	int pairapple= 0;
        	int pairbanana=0;
        	if(a%x==0) pairapple=a/x;
        	else pairapple=a/x+1;
        	if(b%y==0) pairbanana=b/y;
        	else pairbanana=b/y+1;
        	if(pairapple>pairbanana)
        	{    int py=y-1;
        	     int prev=0;
        		int c=pairbanana;
        		while(c<pairapple&&py>=1)
        		{   prev=c;
        			if(b%py==0)c=b/py;
        			else c=b/py+1;
        			py--;
        		}
        		if(c>pairapple){
        		if(c-pairapple<pairapple-prev) pairbanana=c;
        		else pairbanana=prev;
        		}
        		else pairbanana=c;
        		
        	}
        	
        	
        	
        	else if(pairbanana>pairapple)
        	{    int px=x-1;
        	     int prev=0;
        		int c=pairapple;
        		while(c<pairbanana&&px>=1)
        		{   prev=c;
        			if(a%px==0)c=a/px;
        			else c=a/px+1;
        		}
        		if(c>pairbanana){
        		if(c-pairbanana<pairbanana-prev) pairapple=c;
        		else pairapple=prev;
        		}
        		else pairapple=c;
        		
        	}
        	int conta=0,contb=0;
        	if(pairapple==0)conta=0;
        	else if(a%pairapple==0)conta=a/pairapple;
        	else conta=a/pairapple+1;
        	if(pairbanana==0)contb=0;
        	else if(b%pairbanana==0)contb=b/pairbanana;
        	else contb=b/pairbanana+1;
        	
        	if(pairapple>pairbanana)
        	{ int counter=0;
        		while(pairapple!=0&&pairbanana!=0)
        		{  
        			for(int i=0;i<conta;i++)
        			System.out.print("a");
        		   for(int j=0;j<contb;j++)
        			   System.out.print("b");
        		   pairapple--;
        		   pairbanana--;
        		   counter+=conta;
        		}
        		for(int i=0;i<conta;i++)
        			System.out.print("a");
        		pairapple--;
        		counter+=conta;
        		while(pairapple!=0)
        		{  System.out.print("*");
        			for(int k=0;k<conta;k++)
        			{ if(counter>=a)break;
        				System.out.print("a");
        			  counter++;
        			}
        			pairapple--;
        		}
        	}
        	else	if(pairapple<pairbanana)
        	{   int counter=0;//
        		while(pairapple!=0&&pairbanana!=0)
        		{  for(int i=0;i<contb;i++)
        			System.out.print("b");
        		   for(int j=0;j<conta;j++)
        			   System.out.print("a");
        		   pairapple--;
        		   pairbanana--;
        		   counter+=contb;//
        		}
        		
        		for(int i=0;i<contb;i++)
        			System.out.print("b");
        		pairbanana--;
        		counter+=contb;//
        		while(pairbanana!=0)
        		{ System.out.print("*");
        			for(int k=0;k<contb;k++)//
        			{if(counter>=b) break;
        			System.out.print("b");
        			counter++;
        			}
        			pairbanana--;
        		}
        	}
        	else {
        		while(pairapple!=0&&pairbanana!=0)
        		{  for(int i=0;i<contb;i++)
        			System.out.print("b");
        		   for(int j=0;j<conta;j++)
        			   System.out.print("a");
        		   pairapple--;
        		   pairbanana--;
        		}
        	}
        	System.out.println();
        }
        		
	}

}
