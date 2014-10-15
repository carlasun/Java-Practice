
public class Hanoi {
	static PStack tower1 = new PStack();
	static PStack tower2 = new PStack();
	static PStack tower3 = new PStack();
	public static void main (String[] args){


		
		//stack with however many discs
		stackDisks(tower1, 1);
		System.out.println("Initialized Towers");
		printTowers();
		
		
		
	}
	
	static void stackDisks(PStack tower, int numDisks){
		while (numDisks > 0){
			tower.push(numDisks*2);
			//weight of value is size of disk
			numDisks--;
		}
	}
	
	static void print(PStack tower){
		int count;
		String disk = "";
		PStack temp = tower;
		while (temp.peek()!=null){
			count = temp.pop();
			for(int i=0; i<count; i++){
				disk += "|";
			}
			System.out.println(disk);
			disk = "";
		}
	}
	
	static void printTowers(){
		print(tower1);
		print(tower2);
		print(tower3);
	}
	static void move (PStack from, PStack buffer, PStack destination){
		buffer.push(from.pop());
		destination.push(buffer.pop());
	}
	
	

}
