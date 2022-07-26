package Practice_Problem;

public class ll {
	private Node head;
	private Node tail;
	public int size;
	ll(){
		this.size = 0;
	}
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}

}
