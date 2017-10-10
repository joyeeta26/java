package LinkedList;

public class LinkedList {

	private class Node {

		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {    // even if this constructor is not made ,the program will run because default constructor will
		                    // set the value of head and tail as null and size as 0
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

	public void Addfirst(int item) {
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

	public void Addlast(int item) {
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
			throw new Exception(" list empty");
		}

		return this.head.data;
	}

	public int getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		return this.tail.data;
	}

	public void AddAt(int item, int indx) throws Exception {

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

	public int getAt(int indx) throws Exception {

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

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		int rv = head.data;
		if (this.size == 1) {
			this.head = this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}

	public int removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception(" list empty");
		}
		int rv = tail.data;
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

	public int removeAt(int indx) throws Exception {
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
	private Node getNodeAt(int idx) throws Exception {
		if (this.IsEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Index out of bound");
		}

		Node rv = this.head;
		int i = 0;
		while (i < idx) {
			rv = rv.next;
			i++;
		}

		return rv;
	}
	public void reverseDI() throws Exception {
		int li = 0, ri = this.size - 1;

		while (li < ri) {
			Node left = this.getNodeAt(li);
			Node right = this.getNodeAt(ri);

			int temp = left.data;
			left.data = right.data;
			right.data = temp;

			li++;
			ri--;
		}
	}

	public void reversePI() {
		Node prev = this.head;
		Node temp = this.head.next;
		Node curr = null;

		while (temp != null) {
			curr = temp;
			temp = curr.next;

			// work area
			curr.next = prev;
			// work area

			prev = curr;
		}

		Node swap = this.head;
		this.head = this.tail;
		this.tail = swap;

		this.tail.next = null;
	}

	public void reversePR() {
		this.reversePR(this.head, this.head.next);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;

		this.tail.next = null;
	}

	private void reversePR(Node prev, Node curr) {
		if (curr == null) {
			return;
		}
		this.reversePR(prev.next, curr.next);
		curr.next = prev;
	}

	

	public void reverseDR_WORKING() {
		HeapMover left = new HeapMover();
		left.node = this.head;

		this.reverseDR_WORKING(left, this.head, 0);
	}

	private void reverseDR_WORKING(HeapMover left, Node right, int floor) {
		if (right == null) {
			return;
		}

		this.reverseDR_WORKING(left, right.next, floor + 1);

		if (floor >= this.size / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;

			left.node = left.node.next;
		}
	}

	private class HeapMover {
		Node node;
	}

	public void displayReverse() {
		this.displayReverse(this.head);
		System.out.println("END");
	}

	private void displayReverse(Node node) {
		if (node == null) {
			return;
		}
		this.displayReverse(node.next);
		System.out.print(node.data + " => ");
	}

	public void kreverse(int k) throws Exception {
		if (this.size % k != 0) {
			throw new Exception("Size must be a multiple of k");
		}

		LinkedList output = null, curr = null;

		while (!this.IsEmpty()) {
			curr = new LinkedList();

			for (int i = 0; i < k; i++) {
				curr.Addfirst(this.removefirst());
			}

			if (output == null) {
				output = curr;
			} else {
				output.tail.next = curr.head;
				output.tail = curr.tail;

				output.size += curr.size;
			}
		}

		this.head = output.head;
		this.tail = output.tail;
		this.size = output.size;

	}

	public void fold() {
		HeapMover left = new HeapMover();
		left.node = this.head;

		this.fold(left, this.head, 0);
	}

	private void fold(HeapMover left, Node right, int floor) {
		if (right == null) {
			return;
		}

		this.fold(left, right.next, floor + 1);

		if (floor > this.size / 2) {
			Node oln = left.node.next;
			left.node.next = right;
			right.next = oln;
            left.node = oln;
		}

		if (floor == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	public boolean IsPalindrome() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		return this.IsPalindrome(left, this.head);
	}

	private boolean IsPalindrome(HeapMover left, Node right) {
		if (right == null) {
			return true;
		}

		boolean rv = this.IsPalindrome(left, right.next);

		if (rv == false) {
			return false;
		}

		if (left.node.data != right.data) {
			return false;
		} else {
			left.node = left.node.next;
			return true;
		}
	}

	public int mid() {
		return this.midNode().data;
	}
	
	private Node midNode(){
		Node slow = this.head, fast = this.head;
		
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	public int kthFromLast(int k) {
		Node slow = this.head, fast = this.head;
		
		for(int i = 0; i < k ; i++){
			fast  = fast.next;
		}
		
		while(fast != null){
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.data;
	}

	public LinkedList mergeSortedLists(LinkedList other){
		LinkedList rv = new LinkedList();
		
		Node tNode = this.head;
		Node oNode = other.head;
		
		while(tNode != null && oNode != null){
			if(tNode.data < oNode.data){
				rv.Addlast(tNode.data);
				tNode = tNode.next;
			} else {
				rv.Addlast(oNode.data);
				oNode = oNode.next;
			}
		}
		
		while(tNode != null){
			rv.Addlast(tNode.data);
			tNode = tNode.next;
		}
		
		while(oNode != null){
			rv.Addlast(oNode.data);
			oNode = oNode.next;
		}
		
		return rv;
	}
	
	public LinkedList mergeSort(){
		if(this.size == 1){
			LinkedList base = new LinkedList();
			
			base.Addlast(this.head.data);
			
			return base;
		}
		
		Node midNode = this.midNode();
		Node midNodeNext = midNode.next;
		
		// divide the lists
		LinkedList fhalf = new LinkedList();
		
		fhalf.head = this.head;
		fhalf.tail = midNode;
		fhalf.tail.next = null;
		fhalf.size = (this.size + 1) / 2;
		
		LinkedList shalf = new LinkedList();
		
		shalf.head = midNodeNext;
		shalf.tail = this.tail;
		shalf.size = this.size / 2;
		
		// sort the lists
		fhalf = fhalf.mergeSort();
		shalf = shalf.mergeSort();
        midNode.next = midNodeNext; // restoring the list
		
		// merge the sorted lists
		LinkedList rv = fhalf.mergeSortedLists(shalf);
		
		return rv;
	}
	
	
}
