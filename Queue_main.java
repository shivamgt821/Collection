class Node_03 {
	Object ele;
	Node_03 next;
	
	
	Node_03(Object e, Node_03 n){
		ele = e;
		next = n;
		
	}
}
public class Queue {
	private Node_03 first = null;
	private int count = 0;
	private Node_03 last;

	public void add(Object e) {
		if(first == null) {
			first = new Node_03(e,null);
			last = first;
			count++;
			return;
		}
		last.next = new Node_03(e,null);
		last = last.next;
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if(size() == 0) return true;
		return false;
	}
	
	public Object poll() {
		
		if(isEmpty()) return null;
		
		Object e = first.ele;
		first = first.next;
		count--;
		if(isEmpty()) last = null;
		return e;
	}
	public Object peek() {
		
		if(isEmpty()) return null;
		return first.ele;
	}
	
public String toString() {
		
		if(first == null) return "[]";
		
		String s = "["+first.ele;
		Node_03 curr = first;
		while(curr.next != null) {
			
			curr = curr.next;
			s = s+","+curr.ele;
		}
		s = s+"]";
		return s;
	}
}

public class Queue_main {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
//		q.add(50);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.size());
	}
}
