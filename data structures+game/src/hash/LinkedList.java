package hash;

public class LinkedList<T> {

	private class Node {

		T data;
		Node next;

		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean IsEmpty() {
		return this.size == 0;
	}

	public void Addfirst(T item) {
		Node temp = new Node(item, head);
		this.head = temp;
		if (size == 0) {
			this.head = this.tail = temp;
		} else {
			this.head = temp;
		}
		this.size++;
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " , ");
			temp = temp.next;
		}

	}

	public void Addlast(T item) {
		Node temp = new Node(item, null);

		if (size == 0) {
			this.head = this.tail = temp;
		} else {
			this.tail.next = temp;
			this.tail = temp;
		}
		this.size++;
	}

	public T getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}

		return this.head.data;
	}

	public T getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		return this.tail.data;
	}

	public void AddAt(T item, int indx) throws Exception {

		if (indx < 0 || indx > this.size()) {
			throw new Exception("index out of bound");
		}
		if (indx == 0) {
			Addfirst(item);
		} else if (indx == this.size) {
			Addlast(item);
		} else {
			Node mn1 = getnodeAt(indx - 1);
			Node np1 = mn1.next;
			Node temp = new Node(item, np1);
			mn1.next = temp;
			this.size++;
		}
	}

	public T getAt(int indx) throws Exception {

		Node node = getnodeAt(indx);
		return node.data;
	}

	private Node getnodeAt(int indx) throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		if (indx < 0 || indx >= this.size) {
			throw new Exception("index out of bound");
		}
		Node rv = this.head;
		int i = 0;
		while (i < indx) {
			rv = rv.next;
			i++;
		}
		return rv;
	}

	public T removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		T rv = head.data;
		if (this.size == 1) {
			this.head = this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}

	public T removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		T rv = tail.data;
		if (this.size == 1) {
			this.head = this.tail = null;
		} else {
			Node node = getnodeAt(this.size - 2);
			this.tail = node;
			node.next = null;
		}
		this.size--;
		return rv;
	}

	public T removeAt(int indx) throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		if (indx < 0 || indx >= this.size) {
			throw new Exception("index out of bound");
		}
		if (indx == 0) {
			return removefirst();
		} else if (indx == this.size - 1) {
			return removelast();
		} else {
			Node nm1 = getnodeAt(indx - 1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			size--;
			return n.data;
		}
	}

	
}
