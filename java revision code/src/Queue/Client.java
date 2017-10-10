package Queue;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Queue q = new Queue(3);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.display();
    System.out.println(q.front());
    System.out.println(q.dequeue());
    q.enqueue(4);
    q.display();
	}

}
