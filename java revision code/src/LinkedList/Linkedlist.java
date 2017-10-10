package LinkedList;

public class Linkedlist {

	private class Node {
		private int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public Linkedlist() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;

	}

	public void addfirst(int item) {
		Node node = new Node(item, this.head);
		this.head = node;
		if (this.size == 0) {
			this.tail = node;
		}
		this.size++;
	}

	public void addlast(int item) {

		Node temp = new Node(item, null);

		if (size == 0) {
			this.head = this.tail = temp;
		} else {
			this.tail.next = temp;
			this.tail = temp;
		}
		this.size++;
	}

	public int getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("empty linked list");
		}
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("empty linked list");
		}
		return this.tail.data;
	}

	public void removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("empty linked list");
		}
		this.head = this.head.next;
		this.size--;
	}

	public void removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("empty linked list");
		}
		if (this.size == 1) {
			this.tail = null;
			this.head = null;
			this.size--;
		} else {
			Node node = this.head;
			while (true) {
				if (node.next == this.tail) {
					this.tail = node;
					node.next = null;
					this.size--;

					break;
				}
				node = node.next;
			}
		}

	}

	public int getat(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("index out of range");
		}
		Node node = this.head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node.data;
	}

	public void addat(int item, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("index out of range");
		}
		if (index == 0) {
			Node newnode = new Node(item, this.head);
			this.head = newnode;
		} else if (index == this.size) {
			Node newnode = new Node(item, null);
			this.tail.next = newnode;
			this.tail = newnode;
		} else {
			Node node = this.head;
			for (int i = 1; i < index; i++) {
				node = node.next;
			}
			Node newnode = new Node(item, node.next);
			node.next = newnode;
		}
		this.size++;
	}

	public int removeat(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("index out of range");
		}
		int rv = 0;
		if (index == 0) {
			rv = this.head.data;
			this.head = this.head.next;

		} else {
			Node node = this.head;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			rv = node.next.data;
			node.next = node.next.next;
		}
		this.size--;
		return rv;
	}

	public void display() {
		Node node = this.head;
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
		}
		System.out.println();
	}

	private Node getnodeat(int index) throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("index out of range");
		}
		Node rv = this.head;
		for (int i = 0; i < index; i++) {
			rv = rv.next;
		}
		return rv;
	}

	public void reverseDI() throws Exception {
		if (this.size == 0) {
			throw new Exception("linked list is empty");
		}
		int li = 0;
		int hi = this.size - 1;
		while (li < hi) {
			Node one = getnodeat(li);
			Node two = getnodeat(hi);
			int temp = one.data;
			one.data = two.data;
			two.data = temp;
			li++;
			hi--;
		}
	}

	// whenever there is difficulty in recursion ,make a separate class like
	// heapmover
	public void reverseDR() throws Exception {
		if (this.size == 0) {
			throw new Exception("empty linked list");
		}
		heapmover h = new heapmover();
		h.left = this.head;
		reverseDR(h, this.head, 0);
	}

	private void reverseDR(heapmover h, Node right, int si) {
		if (right == null) {
			return;
		}
		reverseDR(h, right.next, si + 1);
		if (si >= this.size / 2) {
			int temp = h.left.data;
			h.left.data = right.data;
			right.data = temp;
			h.left = h.left.next;
		}

	}

	private class heapmover {
		Node left;
	}

	public void reversePI() {
		Node curr = this.head.next;
		Node prev = this.head;
		while (curr != null) {

			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePR() {

		reversePR(this.head, this.head.next);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node prev, Node curr) {
		if (curr == null) {
			return;
		}
		reversePR(prev.next, curr.next);
		curr.next = prev;
	}

	public void displayreverse() {
		displayreverse(this.head);
	}

	private void displayreverse(Node node) {
		if (node == null) {
			return;
		}
		displayreverse(node.next);
		System.out.print(node.data);
	}

	public void kreverse(int k) throws Exception {
		if (this.size % k != 0) {
			throw new Exception("size should be a multiple of k");
		}
		Linkedlist curr = new Linkedlist();
		Linkedlist output = new Linkedlist();
		Node node = this.head;
		while (node != null) {
			if (curr.size == k) {
				if (output.size == 0) {
					output.head = curr.head;
					output.tail = curr.tail;
					output.size = k;
					curr = new Linkedlist();
				} else {
					output.tail.next = curr.head;
					output.tail = curr.tail;
					output.size += k;
					curr = new Linkedlist();
				}
			}
			curr.addfirst(node.data);
			node = node.next;
		}
		this.head = output.head;
		this.tail = output.tail;
		this.size = output.size;
	}

	public void fold() {
		heapmover h = new heapmover();
		h.left = this.head;
		fold(h, this.head, 0);
	}

	private void fold(heapmover h, Node node, int si) {
		if (node == null) {
			return;
		}
		fold(h, node.next, si + 1);
		if (si > this.size / 2) {
			Node temp = h.left.next;
			h.left.next = node;
			node.next = temp;
			h.left = temp;
		}
		if (si == this.size / 2) {
			this.tail = node;
			node.next = null;

		}
	}

	public boolean ispalindrome() {

		heapmover h = new heapmover();
		h.left = this.head;
		boolean b = ispalindrome(h, this.head, 0);
		return b;
	}

	private boolean ispalindrome(heapmover h, Node node, int si) {
		if (node == null) {
			return true;
		}
		boolean b = ispalindrome(h, node.next, si + 1);
		if (si >= this.size / 2) {
			if (node.data != h.left.data) {
				return false;
			}
		}
		h.left = h.left.next;
		return b;
	}

	public int getmidnodedata() {
		Node mid = getmidnode();
		return mid.data;
	}

	private Node getmidnode() {

		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	public int getKthfromlastnodedata(int k) { // last element is defined as 0th
												// from last
		Node Kthfromlast = getKnode(k);
		return Kthfromlast.data;
	}

	private Node getKnode(int k) {

		Node slow = this.head;
		Node fast = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}

	private Linkedlist merge2sortedlists(Linkedlist other) {
		Linkedlist rv = new Linkedlist();
		Node one = this.head;
		Node two = other.head;
		while (one != null && two != null) {
			if (one.data < two.data) {
				rv.addlast(one.data);
				one = one.next;
			} else {
				rv.addlast(two.data);
				two = two.next;
			}
		}
		if (one != null) {
			while (one != null) {
				rv.addlast(one.data);
				one = one.next;
			}
		}
		if (two != null) {
			while (two != null) {
				rv.addlast(two.data);
				two = two.next;
			}
		}

		return rv;
	}
	
	public Linkedlist mergesort(){
		
		if(this.size==1){
			Linkedlist base = new Linkedlist();
			base.addlast(this.head.data);
			return base;
		}
		
		Linkedlist fhalf=new Linkedlist();
		Linkedlist shalf= new Linkedlist();
		Node midnode=getmidnode();
		fhalf.head=this.head;
		fhalf.tail=midnode;
		
		fhalf.size=(this.size+1)/2;
		shalf.head=midnode.next;
		shalf.tail=this.tail;
		shalf.size=this.size/2;
		midnode.next=null;
		fhalf=fhalf.mergesort();
		shalf=shalf.mergesort();
		Linkedlist rv = fhalf.merge2sortedlists(shalf);
		return rv;
		
	}
	
	
}
