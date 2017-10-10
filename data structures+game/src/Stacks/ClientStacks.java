package Stacks;

public class ClientStacks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   Queue q=new Queue(4);
   
    q.enqueue(1);
    q.enqueue(2);
    
    q.display();
  
   
    displayreverse(q,0);
    q.display();
    
    
   } 
    
  
   
	
	 public static void displayreverse(Queue Queue,int si) throws Exception
	 {   
	   if(si==Queue.size() )
	   { return;}
	      int t=Queue.dequeue();
		   Queue.enqueue(t);
		 
		 displayreverse(Queue,si+1);
		
		 System.out.println(t); 
		 
	   
  }
	 public static void reversequeue(Queue Queue) throws Exception
	 {     if(Queue.size()==0)
	   { return;}
		 int t=Queue.dequeue();
		 reversequeue(Queue);
		 Queue.enqueue(t);
	 } 
		

	}
