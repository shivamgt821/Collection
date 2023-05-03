import java.util.SortedSet; 
import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {

		SortedSet <Integer>s = new TreeSet<Integer>();
		s.add(50);
		s.add(10);
		s.add(40);
		s.add(60);
		s.add(30);
		s.add(20);
		
		System.out.println(s);
		
		SortedSet s1 = s.headSet(40);
		disp(s1);
		
		SortedSet s2 = s.tailSet(40);
		disp(s2);
		
		SortedSet s3 = s.subSet(20,50);
		disp(s3);
	}
	
	static void disp(SortedSet s) {
		for(Object o:s)System.out.println(o+" ");
		System.out.println();
	}

}
