package Stack;

public class Stack {
	private int[] data;
	private int tos;

	public Stack(int capacity) {
		this.data = new int[capacity];
		this.tos = -1;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("stack is full,item cannot be added");
		}
		this.tos++;
		data[this.tos] = item;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack already empty");
		}
		int temp = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return temp;
	}

	public int top() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack  empty");
		}
		return this.data[this.tos];
	}

	public void display() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack empty.Nothing to display");
		}
		int c=this.tos;
		while (c != -1) {
			System.out.println(this.data[c]);
		    c--;
		}
	}

}
