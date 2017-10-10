package Inheritance;

public class ClientQueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue q = new DynamicQueue(2);

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		

		q.display();

	}
}
