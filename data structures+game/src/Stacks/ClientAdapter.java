package Stacks;

public class ClientAdapter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Queue primary=new Queue(2);
		 Queue helper=new Queue(2);
		   
	    primary.enqueue(1);
		    primary.enqueue(2);
		    primary.display();
		    primary.dequeue();
	}

}
