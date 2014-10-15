
public class PNode {
	//linked list
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
	
	PNode deleteNode(PNode head, int d){
		PNode n = head;
		if (n.data == d){
			return head.next;
		}
		
		while (n.next != null ){
			if (n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	
	
}
