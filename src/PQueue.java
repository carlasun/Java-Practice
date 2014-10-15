
public class PQueue {
	PNode first, last;
	
	void enqueue(int value){
		if( first == null){
			last = new PNode(value);
			first = last;
		} else {
			last.next = new PNode(value);
			last = last.next;
		}
	}
	
	int dequeue(){
		if (first != null){
			int stuff = first.data;
			first = first.next;
			if (first == null) last = null;
			return stuff;
		}
		return -1;
	}
}
