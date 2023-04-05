import java.util.LinkedList; 
import java.util.Iterator;

public class AddStringToLinkedListAndInterate {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("is");
		list.add("an");
		list.add("easy");
		list.add("languages");
		
		System.out.println("The List is :\n"+list);
	
		Iterator<String> iter = list.iterator();
		System.out.println("\nThe Iterator value of list are:");
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}
}
