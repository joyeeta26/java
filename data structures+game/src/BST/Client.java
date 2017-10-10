package BST;

import BinaryTrees.Binarytrees;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
			int a[] = { 12, 25, 30, 37, 40, 50, 60, 62, 70, 75, 87 };
			
			BST bt = new BST(a);
			//bt.display();
//			System.out.println(bt.max());
//			System.out.println(bt.min());
//			System.out.println(bt.find(12));
//			System.out.println(bt.find(121));
//			bt.add(10);
//			bt.add(25);
//			bt.add(35);
//			bt.add(55);
			System.out.println(">>>>>>>>");
			//bt.remove(50);
			//bt.replcebysum();
			//bt.printinrange(30, 70);
			//bt.display();
			System.out.println(">>>>>>>>");
			bt.replcebysummax();
			bt.display();
		
		}

	}