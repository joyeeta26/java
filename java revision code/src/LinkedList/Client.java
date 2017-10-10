package LinkedList;

public class Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     Linkedlist l=new Linkedlist();
     l.addfirst(1);
     l.addlast(2);
     l.addat(4, 0);
     l.addat(6, 3);
     l.addat(3, 1);
     l.display();
     l.mergesort().display();     
    	}

}
