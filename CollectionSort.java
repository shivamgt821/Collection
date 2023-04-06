import java.util.ArrayList;    
import java.util.Collections;

public class CollectionSort {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(40);
		a.add(10);
		a.add(20);
		a.add(30);
		Collections.sort(a);
		for(Object o:a)
		System.out.println(o);
	}

}
