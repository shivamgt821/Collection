import java.util.ArrayList; 
import java.util.Iterator;
public class AddStringToArrayListAndInterate {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
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
