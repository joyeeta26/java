package Stacks;

public class Stacks {
	private int[] data;
	private int tos;

	public Stacks(int capacity) {                                //constructor
		this.data = new int[capacity];
		 this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception(" stack full");
		}
		this.tos++;
		this.data[this.tos] = item;
		
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception(" stack empty");
		}
		int rv = data[this.tos];
		data[this.tos] = 0;
		tos--;
		return rv;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception(" stack empty");
		}
		int rv = data[this.tos];

		return rv;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void display() {
	
		for (int i = this.tos; i >= 0; i--) {
			System.out.println(data[i]);
		}
	}
}
