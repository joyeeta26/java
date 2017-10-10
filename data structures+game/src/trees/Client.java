package trees;

public class Client {
	// 10 3 20 2 50 0 60 0 30 3 70 0 80 0 90 0 40 2 100 0 110 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericTree gt = new GenericTree();
		//GenericTree g = new GenericTree();
		// gt.display();
		// System.out.println(gt.max());
		// System.out.println(gt.find(800));
		// System.out.println(gt.height());
		// System.out.println(gt.size2());
		// gt.postorder();
		// System.out.println();
		// gt.preorderI();
		// System.out.println();
		//
		// gt.levelorder();
//		gt.mirror();
//		System.out.println(gt.levelmax(1));
//      Boolean b=  gt.isisomorphic(g);
//      System.out.println(b);
//		 gt.levelordernextline();
//		 gt.levelorderzz();
       // gt.display();
		//System.out.println(gt.countleaforder());
		//gt.printatlevel(2);
		gt.linearize2();
		gt.display();
	}

}
