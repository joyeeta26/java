package Inheritance;

import Stacks.Stacks;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStacks st = new DynamicStacks(5);
		DynamicStacks h = new DynamicStacks(5);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.display();
		st.pop();
		
		
		st.display();
	}
}