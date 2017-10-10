package GenericTrees;

public class Client {
// 10 3 20 2 50 0 60 0 30 3 70 0 80 0 90 0 40 2 100 0 110 0 , can take this as input
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   GenericTree  gt = new GenericTree();
   gt.display();
//   System.out.println(gt.size());
//   System.out.println(gt.size2());
   
//   System.out.println(gt.height());
//   System.out.println(gt.max());
//   System.out.println(gt.ispresent(110));
//   System.out.println(gt.ispresent(22));
//   gt.preorder();
//   System.out.println(".............................");
//   gt.postorder();
//   System.out.println(".............................");
     gt.levelorder();
     System.out.println("...............................");
     gt.preorderI();
	}

}
