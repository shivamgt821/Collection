public class Node_01 {

	Object ele;
	Node_01 next;
	Node_01 prev;
	
	
	Node_01(Object e, Node_01 n, Node_01 p){
		
		ele = e;
		next = n;
		prev = p;
		 
	}
}

public class DoublyLinkedList {

	private Node_01 first = null;
	private int count = 0;

	public void add(Object e) {

		if (first == null) {

			first = new Node_01(e, null, null);
			count++;
			return;
		}
		Node_01 curr = first;
		while (curr.next != null) {

			curr = curr.next;
		}
		Node_01 n = new Node_01(e, null, curr);
		curr.next = n;
		count++;
	}

	public void add(int index, Object e) {

		if (index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();

		if (index == 0) {

			Node_01 n = new Node_01(e, first, null);
			first.prev = n;
			first = n;
			count++;
			return; 
		}
		Node_01 curr = first;
		for (int i = 1; i < index; i++) {

			curr = curr.next;
		}
		Node_01 n = new Node_01(e, curr.next, curr);
		curr.next.prev = n;
		curr.next = n;
		count++;
	}
public void remove(int index) {
		
		if(index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();
		
		if(index == 0) {
			
			first = first.next;
			count--;
			return;
		}
		Node_01 curr = first;
		for(int i=1; i<index; i++) {
			
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
	}

	public Object getEle(int index) {

		if (index <= -1 || index >= size())
			throw new IndexOutOfBoundsException();

		Node_01 curr = first;
		for (int i = 1; i <= index; i++) {

			curr = curr.next;
		}
		return curr.ele;
	}

	public int size() {

		return count;
	}
}
public class DoublyLinkedListMain {

	public static void main(String[] args) {

		DoublyLinkedList d = new DoublyLinkedList();
		
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
		d.add(50);
		d.add(70);
		d.add(3,90);
		d.remove(6);
		
		for(int i=0; i<d.size(); i++) {
			
			System.out.print(d.getEle(i)+" ");
		}
		System.out.println();
	}
}
