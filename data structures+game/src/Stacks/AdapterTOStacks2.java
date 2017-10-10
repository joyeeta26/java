package Stacks;

public class AdapterTOStacks2 {

	private Queue primary;
	private Queue helper;

	public AdapterTOStacks2(int cap) {
		this.primary = new Queue(cap);
		this.helper = new Queue(cap);
	}

	public void push(int item) throws Exception {
		try {
			while(primary.size()>0) {
				int t = primary.dequeue();
				helper.enqueue(t);

			}
			primary.enqueue(item);
			while(helper.size()>0) {
				int t = helper.dequeue();
				primary.enqueue(t);
			}

		} catch (Exception ex) {
			throw new Exception("Stack is Full");
		}
	}

	public int pop() throws Exception {
		try {
			return primary.dequeue();
		} catch (Exception ex) {
			throw new Exception("Stack is empty");
		}
	}

	public int top() throws Exception {
		try {
			return primary.front();
		} catch (Exception ex) {
			throw new Exception("Stack is empty");
		}
	}

	public int size() {
		return primary.size();
	}

	public boolean isempty() {
		return primary.size() == 0;
	}

	public void display() throws Exception {
		this.primary.display();
	}

}
