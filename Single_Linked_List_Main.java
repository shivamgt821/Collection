class Node {
	
	Object ele;
	Node next;
	
	Node(Object e , Node n){
		ele = e;
		next = n;
	}
}

public class Single_Linked_List {

	private Node first = null;
	private int count = 0;
	
	public void add(Object e) {
		
		if(first == null) {
			
			first = new Node(e,null);
			count++;
			return;
		}
		Node curr = first;
		while(curr.next != null) {
			
			curr = curr.next;
		}
		curr.next = new Node(e,null);
		count++;
	}
	
	public void add(int index, Object e) {
		
		if(index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		
		if(index == 0) {
			
			first = new Node(e, first);
			count++;
			return;	
		}
		Node curr = first;
		for(int i=1; i<index; i++) {
			
			curr = curr.next;
		}
		curr.next = new Node(e, curr.next);
		count++;
	}
	
	public Object getEle(int index) {
		
		if(index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		
		Node curr = first;
		for(int i=1; i<=index; i++) {
			
			curr = curr.next;
		}
		return curr.ele;
	}

	public void remove(int index) {
		
		if(index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		
		if(index == 0) {
			
			first = first.next;
			count--;
			return;
		}
		Node curr = first;
		for(int i=1; i<index; i++) {
			
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
	}
	
	
	
	public void clear() {
		
		first = null;
		count = 0;
	} 
	
	public int size() {
		
		return count;
	}
	public void reverse() {
		
		Node prev = null;
		Node curr = first;
		Node next = null;
		
		while(curr != null) {
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
	}
		first = prev;
}
	public String toString() {
		
		if(first == null) return "[]";
		
		String s = "["+first.ele;
		Node curr = first;
		while(curr.next != null) {
			
			curr = curr.next;
			s = s+","+curr.ele;
		}
		s = s+"]";
		return s;
	}
}


public class Single_Linked_List_Main {

	public static void main(String[] args) {

		Single_Linked_List l = new Single_Linked_List();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(4,90);
//		l.clear();      // []
//		l.remove(4);
		System.out.println(l.size());
//		System.out.println(l.getEle(3));
		System.out.println(l);
//		l.reverse();
//		System.out.println(l);   // [50,40,30,20,10]
		
	}
}



















