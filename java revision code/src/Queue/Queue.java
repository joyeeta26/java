package Queue;

public class Queue {
	private int size;
	private int front;
	private int[] data;

	public Queue(int capacity) {
		this.data = new int[capacity];
		this.size = 0;
		this.front = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void enqueue(int item) throws Exception {
		if (this.size == this.data.length) {
			throw new Exception("Queue already full");
		}
		int rear = (this.size + this.front) % this.data.length;
		this.data[rear] = item;
		this.size++;
	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.size--;
		this.front = (this.front + 1) % this.data.length;
		return rv;
	}

	public int front() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is empty");
		}
		int rv = this.data[this.front];
		return rv;
	}

	public void display() throws Exception {
		if (this.size == 0) {
			throw new Exception("Queue is empty");
		}
		
		for (int i = 0; i < this.size; i++) {
			System.out.println(this.data[(this.front+i)%this.data.length]);

		}
	}
}
