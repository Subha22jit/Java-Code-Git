package DSA;

public class LL {
       private Node head;
       private Node tail;
       public int size;
      LL(){
    	 this.size = 0;   
      }
      
      private class Node {
		    private int value;
		    private Node next;
		      public Node(int value){
		    	this.value = value;
		      }
		      public Node(int value, Node next){
		    	this.value = value;
		    	this.next = next;
		      }
		}

    public void insertFirst(int val) {
    	Node node = new Node(val);
    	node.next = head;
    	head = node;
    	if(tail == null) {
    		tail = head;
    	}
    	size += 1;
    }
    
    public void insertLast(int val) {
    	Node node = new Node(val);
    	if(tail == null) {
    	  insertFirst(val);
    	  return;
    	}
    	tail.next = node;
    	tail = node;
    	size ++;
    }
    
    public void insertIndex(int val, int index) {
    	if(index == 0) {
    		insertFirst(val);
    		return;
    	}
    	if(index == size) {
    		insertLast(val);
    		return;
    	}
    	//for loop using find the temp node
    	
  /*    Node temp = head;
    	for(int i = 1; i < index; i++) {
    		temp = temp.next;
    	}
  */
    	
    	//Without for loop
    	
    	Node prev = get(index - 1);
    	
    	Node node = new Node(val,prev.next);
    	prev.next = node;
    	size++;
    }
    
    public int deleteFirst() {
    	int val = head.value;
    	head = head.next;
    	if(head == null) {
    		tail = null;
  
    	}size--;
    	return val;
     }
    
    public Node get(int index) {
  		// TODO Auto-generated method stub
  		Node node = head;
  		for(int i = 0; i < index; i++) {
  			node = node.next;
  		}return node;
  	}
    
    public Node find(int value) {
    	Node node = head;
    	while(node != null) {
    	  if(node.value == value) {
    		  return node;
    	}
    	 node = node.next;
      }
         return null;
   }
    
    public int deleteLast() {
    	if(size<=1) {
    		return deleteFirst();
    	}
    	Node Secondlast = get(size -2);
    	int val = tail.value;
    	tail = Secondlast;
    	tail.next = null;
    	return val;
    }
    
    public int delete(int index) {
    	if(index == 0) {
    		return deleteFirst();
    	}
    	if(index == size-1) {
    		return deleteLast();
    	}
    	//using the for loop
 /*     Node prev = head;
        for(int i = 1; i < index; i++) {
        prev = prev.next;
        }
 */
    	//without for loop using
    	
        Node prev = get(index-1);
        
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void display() {
    	Node temp = head;
		while(temp != null) {
    		System.out.print(temp.value+" -> ");
    		temp = temp.next;
    	}
    	System.out.println("END");
    }
	
	
   
	public static void main(String args[]) {
		LL list = new LL();
		list.insertFirst(5);
		list.insertFirst(4);
		list.insertFirst(2);
		list.insertFirst(1);
		list.insertLast(6);
		list.insertIndex(55,1);
		list.display();
		System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(1));
		list.display();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
