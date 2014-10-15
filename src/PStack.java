
public class PStack {
	PNode top;
	
	int pop() {
		if (top != null) {
			int item = top.data;
			top = top.next;
			return item;
		}
		return -1;
	}
	
	void push(int value){
		PNode stuff= new PNode(value);
		stuff.next= top;
		top = stuff;
	}
	
	PNode peek(){
		return top;
	}

}
