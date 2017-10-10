package Functionoverloading;

import java.util.Comparator;

public class clent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 4, 8, 3, 6 };
		String[] sarr = { "abc", "def", "acd", "ase" };
		Double[] darr = { 2.3, 4.3, 3.4 };

		car[] cars = new car[5];
		cars[0] = new car("A", 9000, 25);
		cars[1] = new car("B", 2000, 252);
		cars[2] = new car("C", 8000, 235);
		cars[3] = new car("D", 6000, 125);
		cars[4] = new car("E", 4000, 95);
		// bubblesort(arr);
		// bubblesort(sarr);
		// bubblesort(darr);
		bubblesort(cars);
		// display(arr);
		// display(sarr);
		// display(darr);
		display(cars);
		bubblesort(cars, new carnameComparator());
		display(cars);
		bubblesort(cars, new carpriceComparator());
		display(cars);
		bubblesort(cars, new carspeedComparator());
		display(cars);

	}

	public static <T extends Comparable<T>> void bubblesort(T[] arr) {

		int counter = 1;
		while (counter < arr.length) {
			for (int i = 0; i < arr.length - counter; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			counter++;
		}

	}

	public static <T> void bubblesort(T[] arr, Comparator<T> comp) {

		int counter = 1;
		while (counter < arr.length) {
			for (int i = 0; i < arr.length - counter; i++) {
				if (comp.compare(arr[i], arr[i + 1]) > 0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			counter++;
		}
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
			return "[" + this.name + " " + this.price + " " + this.speed + "]";
		}

		@Override
		public int compareTo(car arg0) {
			// TODO Auto-generated method stub
			return this.price - arg0.price;
		}
	}
}
