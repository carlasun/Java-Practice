
public class PNode {
	PNode next = null;
	int data;
	
	public PNode(int d){
		data = d;
	}
	
	void addToTail(int d){
		PNode end = new PNode(d);
		PNode n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
}
