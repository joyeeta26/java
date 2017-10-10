package Stacks;

public class Queue {
	private int[] data;
	private int front;
	private int size;

	public Queue(int capacity) {                                //constructor
		this.data = new int[capacity];
		 this.front=0;
		 this.size= 0;
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception(" queue full");
		}
		int rear=(this.front+this.size)%this.data.length;
		this.data[rear] = item;
		this.size++;
		
	}

	public int dequeue() throws Exception {
		if (this.size() == 0) {
			throw new Exception(" queue empty");
		}
		int rv = data[this.front];
		data[this.front] = 0;
		this.front=(this.front+1)%this.data.length;
		size--;
		return rv;
	}

	public int front() throws Exception {
		if (this.size() == 0) {
			throw new Exception(" queue empty");
		}
		int rv = data[this.front];

		return rv;
	}

	public int size() {
		return this.size ;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void display() {
	
		for (int i = 0; i<this.size ; i++) {
			
			System.out.println(data[(front+i)%this.data.length]);
		}
	}
}

