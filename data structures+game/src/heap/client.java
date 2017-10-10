package heap;



public class client {

	public static void main(String[] args) {
		
		Heap<Integer> hp = new Heap<>(true);
		// hp.add(new student("A", 10));
    
		// hp.add(new student("B", 20));
		// hp.display();
		// student [] stu= new student[5];
		// stu[0]=new student("A", 10);
		// stu[1]=new student("B", 50);
		// stu[2]=new student("C", 30);
		// stu[3]= new student("D", 20);
		// stu[4]= new student("E", 90);
		// hp.display();
		Integer arr[] = { 1, 4, 3, 6, 8 };
		  
		 sort(arr);
		 hp.display();

	}

	public static class student implements Comparable<student> {
		String name;
		int marks;

		public student(String name, int marks) {
			this.name = name;
			this.marks = marks;
		}

		@Override
		public String toString() {
			String rv = "";
			rv = rv + this.name + " " + this.marks;
			return rv;
		}

		@Override
		public int compareTo(student arg0) {
	
			return arg0.marks - this.marks;
		}
	}

	public static void sort(Integer[] arr) {

		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			downheapify(arr, i, arr.length);
		}
		int counter = 1;
		while (counter <= arr.length) {
			int temp = arr[0];
			arr[0] = arr[arr.length - counter];
			arr[arr.length - counter] = temp;
			downheapify(arr, 0, arr.length - counter);
			counter++;
		}
	}

	public static void downheapify(Integer[] arr, int pi, int lp) {
		int lci = 2 * (pi) + 1;

		int rci = 2 * pi + 2;
		int max = pi;

		if (lci < lp && arr[max] < arr[lci]) {
			max = lci;
		}
		if (rci < lp && arr[max] < arr[rci]) {
			max = rci;
		}

		if (max != pi) {
			int temp = arr[max];
			arr[max] = arr[pi];
			arr[pi] = temp;
			downheapify(arr, max, lp);
		}
	}

}
