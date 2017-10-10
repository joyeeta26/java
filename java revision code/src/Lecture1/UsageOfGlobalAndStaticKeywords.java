package Lecture1;

public class UsageOfGlobalAndStaticKeywords {
public static int b=90;     //if we do not use public here,it will be ok but if we didnt use static here,we will have to create
                            //an object UsageOfGlobalAndStaticKeywords l=new UsageOfGlobalAndStaticKeywords(); and then we write
                            // System.out.println(l.b);  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=9;
System.out.println(b);                                    //will print 9
System.out.println(UsageOfGlobalAndStaticKeywords.b); //will print 90
	}

}
