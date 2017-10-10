package graphs;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph gt = new graph();
		gt.addvertex("A");
		gt.addvertex("B");
		gt.addvertex("C");
		gt.addvertex("D");
		gt.addvertex("E");
		gt.addvertex("F");
		gt.addvertex("G");
		gt.addedge("A", "B", 10);
		gt.addedge("A", "D", 40);
		gt.addedge("B", "C", 10);
		gt.addedge("C", "D", 10);
		gt.addedge("D", "E", 2);
		gt.addedge("E", "F", 3);
		gt.addedge("E", "G", 8);
		gt.addedge("F", "G", 3);
		
		// System.out.println(gt.numedge());
		// System.out.println(gt.numvertices());
		// gt.display();
//		gt.dft();
//		System.out.println("------");
//		gt.bft();
	//	gt.dijikstra("A");
//		graph g=gt.MSP();
//		g.display();
		//gt.display();
//		System.out.println(gt.isAcyclic());
//		System.out.println(gt.isconnected());
		//System.out.println(gt.haspath("A", "G"));
//		gt.removeedge("D", "E");
//		gt.display();
//		System.out.println(gt.haspathBSF("A", "G"));
	}

}
