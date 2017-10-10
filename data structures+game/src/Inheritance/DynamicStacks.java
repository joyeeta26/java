package Inheritance;

public class DynamicStacks extends Stacks {

	public DynamicStacks(int cap) {
		super(cap);
	}

	public DynamicStacks() {
		super();
	}

	@Override
	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			System.out.println("double");
			int oa[] = this.data;
			this.data = new int[2 * oa.length];
			for (int i = 0; i < oa.length; i++) {
				this.data[i] = oa[i];
			}
		}
		super.push(item);

	}
	
	
	public int pop() throws Exception {
		
		if (this.size() == data.length/4) {
			System.out.println("half");
			int oa[] = this.data;
			this.data = new int[ oa.length/2];
			for (int i = 0; i < oa.length/4; i++) {
				this.data[i] = oa[i];
			}
		}
		int rv=super.pop();
		return rv;
	}

}
