package Stacks;
public class AdaptertoStacks {

	private Queue primary;
	private Queue helper;

	public AdaptertoStacks(int cap) {
		this.primary = new Queue(cap);
		this.helper = new Queue(cap);
	}

	public void push(int item) throws Exception {
		try {
			this.primary.enqueue(item);
		} catch (Exception ex) {
			throw new Exception("Stack is Full");
		}
	}

	public int top() throws Exception {
		try {
			for (int i = 0; i < primary.size() - 1; i++) {
				int t = primary.dequeue();
				primary.enqueue(t);
			}
			int p = primary.dequeue();
			primary.enqueue(p);
			return p;
		} catch (Exception ex) {
			throw new Exception("Stack is empty");
		}

	}

	public int pop() throws Exception {
		try {
			for (int i = 0; i < primary.size() - 1; i++) {
				int t = primary.dequeue();
				primary.enqueue(t);
			}
			int p = primary.dequeue();

			return p;
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

		displayreverse(0);

	}

	private void displayreverse(int si) throws Exception {
		if (si == primary.size()) {
			return;
		}
		int t = primary.dequeue();
		primary.enqueue(t);

		displayreverse(si + 1);

		System.out.println(t);

	}

}
