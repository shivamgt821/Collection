import java.util.Queue;  
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class Queue {
 
	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		
		q1.add(50); 
		q1.add(20);
		q1.add(40); 
		q1.add(10);
		q1.add(30);
		disp(q1);
		
		Queue<Integer> q2 = new ArrayDeque<Integer>();
		
		q2.add(50); 
		q2.add(20);
		q2.add(40); 
		q2.add(10);
		q2.add(30); 
		disp(q2);
		
		Queue<Integer> q3 = new LinkedList<Integer>();

		q3.add(50); 
		q3.add(20);
		q3.add(40); 
		q3.add(10);
		q3.add(30);
		disp(q3);
		
	}
	static void disp(Queue<Integer> q){
		
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
			}
			System.out.println();

		}
