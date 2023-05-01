class Node {
	
	Object ele;
	Node next;
	
	Node(Object e , Node n){
		ele = e;
		next = n;
	}
	
}
public class LinkedList {

	public static void main(String[] args) {
		
		Node first = null;
		first = new Node(10,null);
		first.next  = new Node(20,null);
		first.next.next = new Node(30,null);
		first.next.next.next = new Node(40,null);
		
		Node curr = first;
		while(curr != null) {
			System.out.println(curr.ele);
			curr = curr.next;
		}
	}
}
