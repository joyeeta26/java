package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

import heap.Heap;
import heap.client.student;

public class graph {

	private class vertex {
		String name;
		HashMap<String, Integer> neighbours;

		public vertex(String name) {
			this.name = name;
			this.neighbours = new HashMap<>();
		}
	}

	private HashMap<String, vertex> vertices;

	public graph() {
		this.vertices = new HashMap<>();
	}

	public int numvertices() {
		return vertices.size();
	}

	public boolean containsvertex(String name) {
		return vertices.containsKey(name);
	}

	public void addvertex(String vname) {
		if (vertices.containsKey(vname)) {
			return;
		} else {
			vertex newv = new vertex(vname);
			vertices.put(vname, newv);
		}
	}

	public void removevertex(String vname) {
		if (!vertices.containsKey(vname)) {
			return;
		} else {
			vertex vremove = vertices.get(vname);
			Set<String> set = vremove.neighbours.keySet();
			for (String ss : set) {
				vertex vtoremove = vertices.get(ss);
				vtoremove.neighbours.remove(vname);
			}
			vertices.remove(vname);
		}
	}

	public int numedge() {
		int rv = 0;
		Set<String> set = vertices.keySet();
		for (String ss : set) {
			vertex v = vertices.get(ss);
			rv = rv + v.neighbours.size();
		}
		return rv / 2;
	}

	public boolean containsedge(String v1name, String v2name) {
		vertex v1 = vertices.get(v1name);
		vertex v2 = vertices.get(v2name);
		if (v1 == null || v2 == null) {
			return false;
		} else {
			return v1.neighbours.containsKey(v2name);
		}
	}

	public void addedge(String v1name, String v2name, int cost) {
		vertex v1 = vertices.get(v1name);
		vertex v2 = vertices.get(v2name);
		if (v1 == null || v2 == null) {
			return;
		} else {
			v1.neighbours.put(v2name, cost);
			v2.neighbours.put(v1name, cost);
		}
	}

	public void removeedge(String v1name, String v2name) {
		vertex v1 = vertices.get(v1name);
		vertex v2 = vertices.get(v2name);
		if (v1 == null || v2 == null) {
			return;
		} else {
			v1.neighbours.remove(v2name);
			v2.neighbours.remove(v1name);
		}
	}

	public void display() {
		Set<String> set = vertices.keySet();

		for (String ss : set) {
			vertex v = vertices.get(ss);
			String rv = "";
			rv = rv + ss + "=>";
			Set<String> sets = v.neighbours.keySet();

			for (String s : sets) {
				rv = rv + "[" + s + "," + v.neighbours.get(s) + "]";

			}
			System.out.println(rv);

		}

	}

	public boolean haspath(String v1name, String v2name)

	{
		HashMap<String, Boolean> gostraight = new HashMap<>();
		vertex v1 = vertices.get(v1name);
		vertex v2 = vertices.get(v2name);
		String rv = "";
		return haspath(v1, v2, gostraight, rv);
	}

	private boolean haspath(vertex v1, vertex v2, HashMap<String, Boolean> hp, String rv) {

		rv = rv + v1.name;
		if (hp.containsKey(v1.name)) {
			return false;
		} else {
			hp.put(v1.name, true);
		}

		if (v1.neighbours.containsKey(v2.name)) {
			rv = rv + v2.name;
			System.out.println(rv);
			return true;
		} else {

			Set<String> sets = v1.neighbours.keySet();
			for (String nbrs : sets) {
				vertex v = vertices.get(nbrs);
				if (haspath(v, v2, hp, rv) == true) {
					return true;
				}

			}
		}
		return false;

	}

	public boolean haspathBSF(String v1name, String v2name)

	{
		HashMap<String, Boolean> gostraight = new HashMap<>();
		vertex v1 = vertices.get(v1name);
		vertex v2 = vertices.get(v2name);
		return haspathBSF(v1, v2, gostraight);
	}

	private boolean haspathBSF(vertex v1, vertex v2, HashMap<String, Boolean> hp) {

		LinkedList<pair> queue = new LinkedList<>();
		pair p = new pair();
		p.v = v1;
		p.osf = " ";
		queue.add(p);
		while (queue.size() != 0) {
			pair temp = queue.removeFirst();
			if (!hp.containsKey(temp.v.name)) {
				hp.put(temp.v.name, true);

				if (temp.v.neighbours.containsKey(v2.name)) {
					System.out.println(temp.osf + temp.v.name + v2.name);
					return true;
				}

				Set<String> sets = temp.v.neighbours.keySet();
				for (String ss : sets) {

					vertex vtx = vertices.get(ss);

					if (!hp.containsKey(vtx.name)) {
						pair mp = new pair();
						mp.v = vtx;
						mp.osf = temp.osf + temp.v.name;
						queue.addLast(mp);
					}

				}
			}

		}
		return false;

	}

	private class pair {
		String osf;
		vertex v;
	}

	public boolean haspathDSF(String v1name, String v2name)

	{
		HashMap<String, Boolean> gostraight = new HashMap<>();
		vertex v1 = vertices.get(v1name);
		vertex v2 = vertices.get(v2name);
		return haspathDSF(v1, v2, gostraight);
	}

	private boolean haspathDSF(vertex v1, vertex v2, HashMap<String, Boolean> hp) {

		LinkedList<pair> stack = new LinkedList<>();
		pair p = new pair();
		p.v = v1;
		p.osf = " ";
		stack.add(p);
		while (stack.size() != 0) {
			pair temp = stack.removeFirst();
			if (!hp.containsKey(temp.v.name)) {
				hp.put(temp.v.name, true);

				if (temp.v.neighbours.containsKey(v2.name)) {
					System.out.println(temp.osf + temp.v.name + v2.name);
					return true;
				}

				Set<String> sets = temp.v.neighbours.keySet();
				for (String ss : sets) {

					vertex vtx = vertices.get(ss);

					if (!hp.containsKey(vtx.name)) {
						pair mp = new pair();
						mp.v = vtx;
						mp.osf = temp.osf + temp.v.name;
						stack.addFirst(mp);
					}

				}
			}

		}
		return false;

	}

	public void dft() {
		HashMap<String, Boolean> hp = new HashMap<>();
		LinkedList<pair> stack = new LinkedList<>();

		Set<String> vts = vertices.keySet();
		for (String ss : vts) {
			if (!hp.containsKey(ss)) {
				pair p = new pair();
				vertex v1 = vertices.get(ss);
				p.v = v1;
				p.osf = " ";
				stack.add(p);
				while (stack.size() != 0) {
					pair temp = stack.removeFirst();
					if (!hp.containsKey(temp.v.name)) {
						hp.put(temp.v.name, true);

						System.out.println(temp.osf + "[" + temp.v.name + "]");

						Set<String> sets = temp.v.neighbours.keySet();
						for (String sst : sets) {

							vertex vtx = vertices.get(sst);

							if (!hp.containsKey(vtx.name)) {
								pair mp = new pair();
								mp.v = vtx;
								mp.osf = temp.osf + temp.v.name;
								stack.addFirst(mp);
							}

						}
					}
				}
			}

		}

	}

	public void bft() {
		HashMap<String, Boolean> hp = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();

		Set<String> vts = vertices.keySet();
		for (String ss : vts) {
			if (!hp.containsKey(ss)) {
				pair p = new pair();
				vertex v1 = vertices.get(ss);
				p.v = v1;
				p.osf = " ";
				queue.add(p);
				while (queue.size() != 0) {
					pair temp = queue.removeFirst();
					if (!hp.containsKey(temp.v.name)) {
						hp.put(temp.v.name, true);

						System.out.println(temp.osf + "[" + temp.v.name + "]");

						Set<String> sets = temp.v.neighbours.keySet();
						for (String sst : sets) {

							vertex vtx = vertices.get(sst);

							if (!hp.containsKey(vtx.name)) {
								pair mp = new pair();
								mp.v = vtx;
								mp.osf = temp.osf + temp.v.name;
								queue.addLast(mp);
							}

						}
					}
				}
			}

		}

	}

	public boolean isAcyclic() {
		HashMap<String, Boolean> hp = new HashMap<>();
		LinkedList<pair> stack = new LinkedList<>();

		Set<String> vts = vertices.keySet();
		for (String ss : vts) {
			if (!hp.containsKey(ss)) {
				pair p = new pair();
				vertex v1 = vertices.get(ss);
				p.v = v1;
				p.osf = " ";
				stack.add(p);
				while (stack.size() != 0) {
					pair temp = stack.removeFirst();
					if (!hp.containsKey(temp.v.name)) {
						hp.put(temp.v.name, true);

						System.out.println(temp.osf + "[" + temp.v.name + "]");

						Set<String> sets = temp.v.neighbours.keySet();
						for (String sst : sets) {

							vertex vtx = vertices.get(sst);

							if (!hp.containsKey(vtx.name)) {
								pair mp = new pair();
								mp.v = vtx;
								mp.osf = temp.osf + temp.v.name;
								stack.addFirst(mp);
							}

						}
					} else {
						return false;
					}
				}
			}

		}
		return true;
	}

	public boolean isconnected() {
		HashMap<String, Boolean> hp = new HashMap<>();
		LinkedList<pair> stack = new LinkedList<>();
		pair p = new pair();

		String zvn = this.vertices.keySet().iterator().next();// for getting the
																// first string
		vertex v = vertices.get(zvn);
		p.osf = zvn;
		p.v = v;
		stack.add(p);
		while (stack.size() != 0) {
			pair temp = stack.removeFirst();
			if (!hp.containsKey(temp.v.name)) {
				hp.put(temp.v.name, true);

				Set<String> sets = temp.v.neighbours.keySet();
				for (String ss : sets) {

					vertex vtx = vertices.get(ss);

					if (!hp.containsKey(vtx.name)) {
						pair mp = new pair();
						mp.v = vtx;
						mp.osf = temp.osf + temp.v.name;
						stack.addFirst(mp);
					}

				}
			}

		}
		return hp.size() == vertices.size();

	}

	// public class Pairs implements Comparable<Pairs> {
	// int cost;
	// vertex vtx;
	// String psf;
	//
	// public boolean equals(Object other) {
	// Pairs op = (Pairs) other;
	// return this.vtx.equals(op.vtx);
	// }
	//
	// @Override // hashcode and equals function work on the address of input
	// variable
	//
	// public int hashCode() {
	// // TODO Auto-generated method stub
	// return this.vtx.hashCode();
	// }
	//
	// @Override
	// public String toString() {
	// String rv = "";
	// rv = this.vtx.name + " psf= " + this.psf + " cost= [" + this.cost + "]";
	// return rv;
	// }
	//
	// @Override
	// public int compareTo(Pairs o) {
	// // TODO Auto-generated method stub
	// return this.cost - o.cost;
	// }
	// }
	//
	// public void dijikstra(String source) {
	//
	// HashMap<String, Pairs> hm = new HashMap<>();
	// HashMap<String, Boolean> processed = new HashMap<>();
	// Heap<Pairs> hp = new Heap<>(true);
	//
	// Set<String> points = vertices.keySet();
	// for (String ss : points) {
	// vertex pointvertex = vertices.get(ss);
	// Pairs mp = new Pairs();
	// mp.cost = Integer.MAX_VALUE;
	// mp.vtx = pointvertex;
	// mp.psf = "";
	// if (pointvertex.name.equals(source)) {
	// mp.cost = 0;
	// }
	// hm.put(pointvertex.name, mp);
	// hp.add(mp);
	//
	// }
	//
	// while (hp.size() != 0) {
	// Pairs np = hp.remove();
	// System.out.println(np);
	// processed.put(np.vtx.name, true);
	// Set<String> nbrs = np.vtx.neighbours.keySet();
	// for (String ss : nbrs) {
	// if (!processed.containsKey(ss)) {
	// Pairs tochange = hm.get(ss);
	// if (tochange.cost > np.cost + np.vtx.neighbours.get(ss)) {
	// tochange.cost = np.cost + np.vtx.neighbours.get(ss);
	// tochange.psf = np.psf + np.vtx.name;
	//
	// int r = hp.getindex(tochange);
	// hp.downheapify(r);
	// hp.upheapify(r);
	//
	// }
	// }
	// }
	//
	// }
	//
	// }

	public class MSPPairs implements Comparable<MSPPairs> {
		int cost;
		vertex vtx;
		vertex acvtx;

		public int compareTo(MSPPairs o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}
	}

	public graph MSP() {
		graph rv = new graph();
		HashMap<String, MSPPairs> hms = new HashMap<>();

		Heap<MSPPairs> hps = new Heap<>(true);

		Set<String> points = vertices.keySet();
		for (String ss : points) {
			vertex pointvertex = vertices.get(ss);
			MSPPairs mp = new MSPPairs();
			mp.cost = Integer.MAX_VALUE;
			mp.vtx = pointvertex;
			mp.acvtx = null;

			hms.put(pointvertex.name, mp);
			hps.add(mp);
			;

		}

		while (hps.size() != 0) {
			MSPPairs np = hps.remove();
			rv.addvertex(np.vtx.name);
			if (np.acvtx != null) {
				rv.addedge(np.vtx.name, np.acvtx.name, np.cost);
			}

			Set<String> nbrs = np.vtx.neighbours.keySet();
			for (String ss : nbrs) {
				if (rv.containsvertex(ss)) {
					continue;
				}

				MSPPairs tochange = hms.get(ss);
				if (tochange.cost > np.vtx.neighbours.get(ss)) {
					tochange.cost = np.vtx.neighbours.get(ss);
					tochange.acvtx = np.vtx;
					int r = hps.getindex(tochange);
					hps.downheapify(r);
					hps.upheapify(r);

				}
			}

		}
		return rv;
	}

}
