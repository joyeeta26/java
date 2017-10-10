package hash;

import java.util.Comparator;

public class LLclent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	LinkedList<car> ll1 = new LinkedList<>();
//
//		ll1.Addfirst(new car("A", 22, 34));
//		ll1.Addfirst(new car("B", 45, 94));
//		ll1.display();
		 
		
		
		
	}

	private static class carspeedComparator implements Comparator<car> {

		@Override
		public int compare(car arg0, car arg1) {
			// TODO Auto-generated method stub
			return arg0.speed - arg1.speed;
		}
	}

	private static class carpriceComparator implements Comparator<car> {

		@Override
		public int compare(car arg0, car arg1) {
			// TODO Auto-generated method stub
			return arg0.price - arg1.price;
		}
	}

	private static class carnameComparator implements Comparator<car> {

		@Override
		public int compare(car arg0, car arg1) {
			// TODO Auto-generated method stub
			return arg0.name.compareTo(arg1.name);
		}
	}

	public static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("END");
	}

	public static class car implements Comparable<car> {
		String name;
		Integer price;
		Integer speed;

		public car(String name, int price, int speed) {
			this.name = name;
			this.price = price;
			this.speed = speed;
		}

		@Override

		public String toString() {
			return "[" + this.name + " " + this.price + "  " + this.speed + "]";
		}

		@Override
		public int compareTo(car arg0) {
			// TODO Auto-generated method stub
			return this.price - arg0.price;
		}
	}
}
