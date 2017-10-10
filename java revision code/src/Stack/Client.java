package Stack;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   Stack st=new Stack(3);
   st.push(1);
   st.push(2);
   st.push(3);
  
  st.pop();
  
   System.out.println(st.top());
   st.display();
   st.push(4);
   System.out.println(st.size());
   st.display();
	}

}
