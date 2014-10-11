
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

}
