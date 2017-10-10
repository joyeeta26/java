package Stacks;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stacks st = new Stacks(5);
		Stacks h=new Stacks(5);
		 st.push(1);
		 st.push(2);
		 st.push(3);
		 st.push(4);
		// st.display();
		// st.pop();
		// int c=st.top();
		// System.out.println(c);
		// st.display();
		//Boolean b = balance("[[[dd[gt(r)]re]]");
		 displayrev(st);
		// sortstack(st,h,0,0);
		 displayrev(st);
	//	System.out.println(b);
//		int [] arr={30,32,35,40,31};
//		 int va[]=span(arr);
//		 for(int val:va)
//		 { System.out.println(val);}
	}

	 public static void displayrev(Stacks Stack) throws Exception {
	 if (Stack.size() == 0) {
	 return;
	 }
	 int t = Stack.pop();
	 displayrev(Stack);
	 System.out.println(t);
	 Stack.push(t);
	 }

	 public static boolean balance(String str) throws Exception {
	 Stacks st = new Stacks(str.length());
	
	 for (int i = 0; i < str.length(); i++) {
	 char ch = str.charAt(i);
	 switch (ch) {
	 case '(':
	 st.push(ch);
	 break;
	
	 case '{':
	 st.push(ch);
	 break;
	 case '[':
	 st.push(ch);
	 break;
	 case ')':
	 if (st.size() == 0 || st.top() != '(') {
	 return false;
	 } else {
	 st.pop();
	 }
	 break;
	 case '}':
	 if (st.size() == 0 || st.top() != '{') {
	 return false;
	 } else {
	 st.pop();
	 }
	 break;
	 case ']':
	 if (st.size() == 0 || st.top() != '[') {
	 return false;
	 } else {
	 st.pop();
	 }
	 break;
	
	 default:
	 break;
	
	 }
	 }
	 if (st.size() == 0)
	 return true;
	 else
	 return false;
	
	 }
	 public static void reversestack(Stacks Stacks,Stacks helper,Boolean b) throws Exception
	 {   
		 
		 if(Stacks.size()==0&&helper.size()==0)
		 { return;}
		 
	   if(Stacks.size()==0)
	   {  
	     b=true;
	    
		 
	   }
	   if(!b)
	   { int t=Stacks.pop();
	      helper.push(t);
	      reversestack(Stacks,helper,b);
	      }
	   if(b)
	   { int t=helper.pop();
	      reversestack(Stacks,helper,b);
	      Stacks.push(t);}
	      
	     
		 
	 
		 
  }
	 

	public static int[] span(int[] arr) throws Exception {
		Stacks st = new Stacks(arr.length);            
		int rv[] = new int[arr.length];
		rv[0] = 1;
		st.push(0);
		for (int i = 1; i < arr.length; i++) {
			int p = 0;
			while (st.size() != 0 && arr[st.top()] < arr[i])

			{
				st.pop();
				p++;
			}
			if(st.size()!=0)
				{rv[i] = p + 1;}
			else { rv[i]=i+1;}
			st.push(i);
		}

		return rv;
	}
//   public static Stacks sortstack(Stacks Stacks,Stacks helper,int prev,int curr) throws Exception
//   {     
	    
	      
}
