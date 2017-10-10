package BinaryTrees;

public class ClientBintree {
//	 50 true 25 true 12 false false true 51 true 30 false false true 40 false
 //false true 75 true 62 true 60 false false true 70 false false true 87
	// false false
//	50 true 25 false false true 75 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 50, 25, 12, 37, 30, 40, 75, 62, 60, 70, 87 };
		int a[] = { 12, 25, 30, 37, 40, 50, 60, 62, 70, 75, 87 };
		int post[] = { 12, 30, 40, 37, 25, 60, 70, 62, 87, 75, 50 };
		Binarytrees bt = new Binarytrees();
		bt.display();
		bt.printpath(82);
		//bt.multisolver(62);
		// bt.multisolver(25);
		// bt.postorder();
		// bt.inorder();
		// bt.preorderI();
		// bt.inorder();
	//System.out.println(bt.bstTD());
	//	System.out.println(bt.daimeter2());
		//bt.daimeter2()
	//	System.out.println(bt.bstTD();
	}

}
